/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa que le permita ingresar tres números e imprima en la consola el más grande de ellos.
*/

package Clase03;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa 3 numeros..");
        System.out.println("\nPrimer numero: ");
        double num1 = input.nextDouble();
        System.out.println("Segundo numero: ");
        double num2 = input.nextDouble();
        System.out.println("Tercer numero: ");
        double num3 = input.nextDouble();

        // double mayor = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        double mayor = Math.max(num1, Math.max(num2, num3));

        System.out.println("El numero mayor es: " + mayor);
        input.close();
    }
}
