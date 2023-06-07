package Clase_5;

import java.util.Scanner;

/* Ejercicio 1 Calculadora para la edad de los perros */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad de su perro: ");
        int edadDelPerro = scanner.nextInt();
        int edadDelPerroEnHumano = edadDelPerro * 7;
        System.out.print("La edad de su mascota es igual a :" + edadDelPerroEnHumano);
    }
}

