/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante.
*/
package Modulo1.Clase03;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa una letra: ");
        char letter = input.next().charAt(0);

        if (letter >= 'a' && letter <= 'z') { 
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("La letter " + letter + " es una vocal.");
            } else {
                System.out.println("La letter " + letter + " es una consonante.");
            }
        } else {
            System.out.println("El carácter ingresado no es una letra válida.");
        }

        input.close();
    }
}