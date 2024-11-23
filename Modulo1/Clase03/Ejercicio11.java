/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba una función en la que pueda ingresar tres números enteros y diferentes. Imprima estos valores en orden ascendente.
*/

package Clase03;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nIngresa tres numeros enteros y diferentes.. ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int first, second, third;

        if (a < b && a < c) {
            first = a;
            if (b < c) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        } else if (b < a && b < c) {
            first = b;
            if (a < c) {
                second = a;
                third = c;
            } else {
                second = c;
                third = a;
            }
        } else {
            first = c;
            if (a < b) {
                second = a;
                third = b;
            } else {
                second = b;
                third = a;
            }
        }

        String result = Integer.toString(first) + Integer.toString(second) + Integer.toString(third);
        System.out.println(result);

        input.close();
    }
}
