package ar.com.centro8.java.curso.consecionaria.productos;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public abstract class Vehiculo implements Comparable<Vehiculo> {
    private final String marca;
    private final String modelo;

    private double precio;

    public String getPrecioFormateado() {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.forLanguageTag("es-AR"));
        DecimalFormat df = new DecimalFormat("#,##0.00", simbolos);
        return "$" + df.format(this.precio);
    }

    @Override
    public abstract String toString();

    // Método compareTo
    @Override
    public int compareTo(Vehiculo otro) {
        int resultado = marca.compareToIgnoreCase(otro.marca);

        if (resultado == 0) {
            resultado = this.modelo.compareToIgnoreCase(otro.getModelo());
        }

        if (resultado == 0) {
            resultado = Double.compare(this.precio, otro.getPrecio());
        }
        return resultado;

    }
}
