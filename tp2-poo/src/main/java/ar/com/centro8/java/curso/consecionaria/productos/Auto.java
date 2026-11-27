package ar.com.centro8.java.curso.consecionaria.productos;

import lombok.Getter;

@Getter
public class Auto extends Vehiculo {
    private final int puertas;

    // Constructor que recibe todo (atributos de la clase padre y los propios en
    // este caso puertas)
    public Auto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio); // Inicializa los atributos de la clase padre Vehiculo
        this.puertas = puertas; // Inicializa el atributo propio de la clase Auto
    }

    // Método toString para cumplir el formato por salida por consola.
    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() +
                " // Puertas: " + puertas + " // Precio: " + getPrecioFormateado();

    }
}
