package ar.com.centro8.java.curso.consecionaria.test;

import ar.com.centro8.java.curso.consecionaria.implementación.CatalogoService;
import ar.com.centro8.java.curso.consecionaria.interfaz.ICatalogo;

public class Test {
    public static void main(String[] args) {
        ICatalogo catalogo = new CatalogoService();

        catalogo.registrarVehiculos();

        catalogo.obtenerMasCaro();

        catalogo.obtenerMasBarato();

        catalogo.buscarPorLetraEnModelo("Y");

        catalogo.ordenarPorPrecioDescendente();

        catalogo.ordenarPorOrdenNatural(); 

    }

}
