/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Pida tres palabras por parte del usuario y la salida de las tres palabras en la pantalla.
*/
package Modulo1.Clase01;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nIntroduce la primer palabra: ");
        String word1 = input.nextLine();

        System.out.println("Introduce la segunda palabra: ");
        String word2 = input.nextLine();

        System.out.println("Introduce la tercera palabra: ");
        String word3 = input.nextLine();

        System.out.println("Las palabras son: " + word1 + " " + word2 + " " + word3);
        input.close();
    }
}
