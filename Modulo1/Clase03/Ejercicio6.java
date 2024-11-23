/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa que permita ingresar un número y determine si es divisible por dos y siete.
*/
package Clase03;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 7 == 0) {
            System.out.println("\nTu numero es divisible por 2 y 7");
            System.out.println("por 2 = "+ (number / 2));
            System.out.println("por 7 = "+ (number / 7));
        } else {
            System.out.println("Tu numero no es divisible por 2 y 7");
        }

        input.close();
    }
}