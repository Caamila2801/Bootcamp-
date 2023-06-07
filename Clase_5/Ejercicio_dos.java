package Clase_5;

import java.util.Scanner;

public class Ejercicio_dos {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese una distancia en millas
        Scanner millas = new Scanner(System.in);
        System.out.print("Ingresa la distancia en millas: ");
        double distanciaEnMillas = millas.nextDouble();

        // Realizar la convercion de la distancia a kilómetros
        double distanciaEnKilometros = distanciaEnMillas * 1.60934;

        // Mostrar la distancia en kilómetros
        System.out.println("La distancia en kilómetros es: " + distanciaEnKilometros);
    }
}