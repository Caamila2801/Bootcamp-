import java.util.Scanner;
public class Ejercicio_dos {
    //Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[5];
        int contador = 0;

        // Pedir que se ingrese los 5 numeros.
        System.out.println("Ingrese 5 numeros: ");
        while (contador < 5) {
            System.out.println("Numero " + (contador + 1) + ":");
            numero[contador] = teclado.nextInt();
            contador++;
        }

        //Mostrar los numeros. Agregar el menor y mayor.
        System.out.println("Los numeros ingresados son: ");
        contador = 0;
        int minimo = numero[0];
        int maximo = numero[0];

        while (contador < 5) {
            System.out.println(numero[contador]);

        if (numero[contador] < minimo) {
            minimo = numero[contador];
        }

        if (numero[contador] < minimo) {
            maximo = numero[contador];
        }

        contador++;
    }
        System.out.println("El numero mayor es: " + minimo);
        System.out.println("El numero menor es: " + maximo);
    }

}
