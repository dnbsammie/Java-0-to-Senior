/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Saludo inicial
*/
package Modulo1.Clase01;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String name = input.nextLine();
        String message = ", Bienvenid@ al curso de Programacion en Java!!!";
        System.out.println(name+message);

        input.close();
    }
}
