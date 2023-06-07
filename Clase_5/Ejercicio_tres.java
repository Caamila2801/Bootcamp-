package Clase_5;

import java.util.Scanner;

public class Ejercicio_tres {
    public static void main(String[] args) {
        // pedir al usuario que ingrese el precio original de un productor
        Scanner precioProducto = new Scanner(System.in);
        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = precioProducto.nextDouble();

        // Pedirle al usuario que ingrese el porcentaje del descuento
        System.out.print("Ingrese el porcentaje de descuento: ");
        double porecetajeDelProducto = precioProducto.nextDouble();

        // Calcular el precio aplicando el descuento
        double precioFinal = precioOriginal - (precioOriginal * porecetajeDelProducto/100);

        // Mostrar el precio final
        System.out.print("El precio final del producto es de: " + precioFinal);

    }
}
