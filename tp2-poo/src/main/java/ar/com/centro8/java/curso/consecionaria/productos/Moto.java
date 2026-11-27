package ar.com.centro8.java.curso.consecionaria.productos;

import lombok.Getter;

@Getter
public class Moto extends Vehiculo {

    private final int cilindrada;

    // Constructor que recibe todo (atributos de la clase padre y los propios en
    // este caso cilindrada).
    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio); // Inicializa los atributos de la clase padre Vehiculo.
        this.cilindrada = cilindrada; // Inicializa el atributo propio de la clase Moto.
    }

    // Método toString para cumplir el formato de salida por consola.
    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() +
                " // Cilindrada: " + cilindrada + "c // Precio: " + getPrecioFormateado();
    }
}
