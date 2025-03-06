/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Area y perimetro de un Rectangulo
*/
package Modulo1.Clase02;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nCalculo de un Rectangulo");

        System.out.println("\n-Introduce el ancho del rectangulo: ");
        double wide = input.nextDouble();

        System.out.println("\n-Introduce la longitud del rectangulo: ");
        double longitude = input.nextDouble();

        System.out.printf("Perimetro del rectangulo: %2f%n", 2*(longitude+wide) );
        System.out.printf("Area del rectangulo: %2f%n", longitude * wide);

        input.close();
    }
}
