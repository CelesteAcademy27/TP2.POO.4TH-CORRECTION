package ar.com.centro8.java.curso.consecionaria.implementación;

import ar.com.centro8.java.curso.consecionaria.interfaz.ICatalogo;
import ar.com.centro8.java.curso.consecionaria.productos.Auto;
import ar.com.centro8.java.curso.consecionaria.productos.Moto;
import ar.com.centro8.java.curso.consecionaria.productos.Vehiculo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CatalogoService implements ICatalogo {

    private final List<Vehiculo> vehiculos = new ArrayList<>();

    @Override
    public List<Vehiculo> registrarVehiculos() {
        // Creación de objetos y agragación a la lista con add.
        System.out.println();
        vehiculos.add(new Auto("Peugeot", "206", 200_000.00, 4));
        vehiculos.add(new Moto("Honda", "Titan", 60_000.00, 125));
        vehiculos.add(new Auto("Peugeot", "208", 250_000.00, 5));
        vehiculos.add(new Moto("Yamaha", "YBR", 80_500.50, 160));

        vehiculos.forEach(System.out::println);
        return new ArrayList<>(vehiculos);

    }

    // OBTENCIÓN DEL VEHÍCULO MÁS CARO
    @Override
    public List<Vehiculo> obtenerMasCaro() {
        System.out.println();
        System.out.println("===========================");
        System.out.println();

        Vehiculo masCaro = vehiculos.stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get();
        System.out.println("Vehículo más caro: " + masCaro.getMarca() + " " +
                masCaro.getModelo());
        return List.of(masCaro);

    }

    // OBTENCIÓN DEL VEHÍCULO MÁS BARATO
    @Override
    public List<Vehiculo> obtenerMasBarato() {
        Vehiculo masBarato = vehiculos.stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get();
        System.out.println("Vehículo más barato: " + masBarato.getMarca() + " " +
                masBarato.getModelo());
        return List.of(masBarato);

    }

    // BUSQUEDA LA LETRA EN EL MODELO
    @Override
    public List<Vehiculo> buscarPorLetraEnModelo(String letra) {
        List<Vehiculo> vehiculosFiltrados = vehiculos.stream()
                .filter(v -> v.getModelo().toLowerCase()
                        .contains(letra.toLowerCase()))
                .toList();

        vehiculosFiltrados.forEach(v -> System.out.println(
                "Vehículo que contiene en el modelo la letra ´" + letra + "´: "
                        + v.getMarca() + " " + v.getModelo() + " " + v.getPrecioFormateado()));
        return vehiculosFiltrados;

    }

    // ORDEN POR PRECIO DESCENDENTE
    @Override
    public List<Vehiculo> ordenarPorPrecioDescendente() {
        System.out.println();
        System.out.println("==========================");
        System.out.println();

        System.out.println("Vehículos ordenados por precio de mayor a menor: ");

        List<Vehiculo> PorPrecio = new ArrayList<>(vehiculos);

        PorPrecio.sort(Comparator.comparingDouble(Vehiculo::getPrecio).reversed());

        PorPrecio.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));

        return PorPrecio;

    }

    // ORDEN NATURAL
    @Override
    public List<Vehiculo> ordenarPorOrdenNatural() {
        System.out.println();
        System.out.println("=========================");
        System.out.println();

        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");

        List<Vehiculo> copia = new ArrayList<>(vehiculos);

        Collections.sort(copia);

        copia.forEach(System.out::println);

        System.out.println();

        return copia;
    }

}
