import java.sql.SQLOutput;
import java.util.Scanner;
public class Ejercicio_tres {
    public static void main(String[] args) {
        //hay que mostrar el promedio. Se debe sumar todos los números y se dividir por 5.
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[5];
        int contador = 0;
        int suma = 0;

        //Pedir al usuario que ingrese 5 numeros.
        System.out.println("Ingrese 5 numeros: ");
        while (contador < 5) {
            System.out.println("Numero " + (contador + 1) + ":");
            numero[contador] = teclado.nextInt();
            suma += numero[contador];
            contador++;
        }
        
        //Mostrar los numeros. Agregar el menor y mayor. Y agregar el promedio.
        System.out.println("Los numeros ingresados son: ");
        contador = 0;
        int minimo = numero[0];
        int maximo = numero[0];

        while (contador < 5) {
            System.out.println(numero[contador]);

            if (numero[contador] < minimo) {
                minimo = numero[contador];
            }

            if (numero[contador] > maximo) {
                maximo = numero[contador];
            }
            contador++;

        //Dividir por 5 los numeros ya ingresados.
            double promedio = (double) suma / 5;
            System.out.println("El mayor minumo es: " + minimo);
            System.out.println("El numero mayor es: " + maximo);
            System.out.println("El promedio de los ingresos es: " + promedio);
        }
    }
}