/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa que permita ingresar un número e identificar si es par o impar.
*/

package Clase03;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("El numero " + number + " es par.");
        } else {
            System.out.println("El numero " + number + " es impar.");
        }
        input.close();
    }
}
