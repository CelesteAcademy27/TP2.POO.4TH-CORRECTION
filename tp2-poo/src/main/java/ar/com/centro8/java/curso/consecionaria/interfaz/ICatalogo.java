package ar.com.centro8.java.curso.consecionaria.interfaz;

import ar.com.centro8.java.curso.consecionaria.productos.Vehiculo;
import java.util.List;

public interface ICatalogo {

    List<Vehiculo> registrarVehiculos();

    List<Vehiculo> obtenerMasCaro();

    List<Vehiculo> obtenerMasBarato();

    List<Vehiculo> buscarPorLetraEnModelo(String letra);

    List<Vehiculo> ordenarPorPrecioDescendente();

    List<Vehiculo> ordenarPorOrdenNatural();

}
