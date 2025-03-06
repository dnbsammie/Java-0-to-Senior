/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: Media Aritmetica
*/
package Modulo1.Clase02;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nCalculadora media aritmetica");
        System.out.println("Introduce el primer numero: ");
        double num1 = input.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        double num2 = input.nextDouble();

        System.out.println("Introduce el tercero numero: ");
        double num3 = input.nextDouble();

        System.out.printf("La media aritmética de los tres números es: %.2f%n", (num1 + num2 + num3) / 3);

        input.close();
    }
}
