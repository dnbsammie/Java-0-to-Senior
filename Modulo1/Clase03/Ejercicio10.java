/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba una función en la que ingrese un número entero entre 1 y 12. Este número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). El resultado debe ser el número de días del mes ingresado.
*/
package Modulo1.Clase03;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un numero entero para seleccionar el mes: ");
        int month = input.nextInt();
        if (month >= 1 && month <= 12) {
            if (month == 2) {
                System.out.println("28");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30");
            } else {
                System.out.println("31");
            }
        } else {
            System.out.println("Ingresa un numero valido...");
        }
        input.close();
    }
}