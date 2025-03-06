/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Realizar un programa que permita hacer la siguiente conversión:
    - Millas a kilómetros.
    - Kilómetros a millas.
*/
package Modulo1.Clase03;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean conv = true;

        while (conv) {
            try {
                System.out.println("\nCONVERSOR DE UNIDADES DE LONGITUD\n");
                System.out.println("Que vas a convertir?: ");
                System.out.println("1. Kilometros a Millas");
                System.out.println("2. Millas a Kilometros");
                System.out.println("3. Salir");
                int option = input.nextInt();

                double value;
                double result;

                switch (option) {
                    case 1:
                        System.out.println("Kilometros a Millas");
                        System.out.println("Ingresa la distancia en kilometros: ");
                        value = input.nextDouble();
                        result = value * 0.621371;
                        System.out.println(value + " kilometros es igual a " + result + " millas.");
                        break;
                    case 2:
                        System.out.println("Millas a Kilometros");
                        System.out.println("Ingresa la distancia en millas: ");
                        value = input.nextDouble();
                        result = value * 1.60934;
                        System.out.println(value + " millas es igual a " + result + " kilometros.");
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        conv = false;
                        break;
                    default:
                        System.out.println("Entrada inválida. Por favor ingresa una opcion valida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor ingresa un numero valido.");
                input.nextLine();
            }
        }
        input.close();
    }
}
