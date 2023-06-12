import java.util.Scanner;

public class Main {
        //Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;

        // Pedirle al usuario que ingrese los 5 numeros.
        System.out.println("Ingrese 5 números:");

        // Realizar el bucle.
        while (contador < 5) {
            System.out.print("Número " + (contador + 1) + ": ");
            numeros[contador] = teclado.nextInt();
            contador++;
        }
        //Devolver al usuario.
        System.out.println("Los números ingresados son:");

        contador = 0;
        while (contador < 5) {
            System.out.println(numeros[contador]);
            contador++;
        }
    }
}

