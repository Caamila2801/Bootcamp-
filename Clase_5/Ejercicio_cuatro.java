package Clase_5;

import java.util.Scanner;

public class Ejercicio_cuatro {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese el total de la cuenta en un restaurante.
        Scanner total = new Scanner(System.in);
        System.out.print("Ingrese el total de la cuenta: ");
        double totalDeCuenta = total.nextDouble();

        // Pedir al usuario que ingrese de propina que desea.
        System.out.print("Ingresa el porcentaje de la propina:");
        double porcentajeDePropina = total.nextDouble();

        // Calcular el monto de la propina. Usando la formula propina = totalCuenta * (porcentajePropina / 100).
        double propina = totalDeCuenta * (porcentajeDePropina/100);

        // Mostrar el resultado del monto de la propina al usuario.
        System.out.print("El monto de la propina es: " + propina);

    }
}
