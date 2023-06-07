package Clase_5;

import java.util.Random;
import java.util.Scanner;
public class Ejercicio_cinco {
    public static void main(String[] args) {
        // Generar un numero aleatorio entre 1 y 100.
        Random numero = new Random();
        int numeroAleatorio = numero.nextInt(100) + 1;

        // Pedirle al usuario que adivine el numero
        Scanner random = new Scanner(System.in);
        int intentos = 0;
        int numeroAdivinado;

        do {
            System.out.print("Adivina el numero entre en 1 y 100: ");
            numeroAdivinado = random.nextInt();
            intentos++;
            if (numeroAdivinado < numeroAleatorio) {
                System.out.print("El numero es menor. Intentalo otra vez");
            } else if (numeroAdivinado > numeroAleatorio){
                System.out.print("El numero es menor. Intentalo otra vez");
            } else {
                System.out.print("Felicitaciones!! Adivinaste el numero " + intentos + "Tantos intentos.");
            }
        } while(numeroAdivinado != numeroAleatorio);
    }
}
