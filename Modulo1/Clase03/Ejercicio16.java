/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa que permita ingresar un número mientras estos sean negativos.
    Detener cuando el número ingresado sea positivo y de cómo resultado la cantidad de números negativos ingresados.
*/
package Modulo1.Clase03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int counter = 0;

    while (true) {
            try {
                System.out.println("Introduce un numero negativo: ");
                number = input.nextInt();

                if (number < 0) {
                    System.out.println("Has ingresado un número negativo. Puedes seguir ingresando números negativos.\n");
                    counter++;
                } else {
                    System.out.println("Tu número es positivo, el programa se detendrá.");
                    break;
                }
            } catch (InputMismatchException e) {
               
                System.out.println("¡Error! Debes ingresar un número entero.");
                input.nextLine(); 
            }
        }
        System.out.println("Numeros negativos ingresados: " + counter);
        
        input.close();
    }
}