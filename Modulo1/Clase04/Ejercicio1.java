/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Conversor unidades de temperatura
*/
package Clase04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean conv = true;

        while (conv) {
            try {
                System.out.println("\nCONVERSOR DE UNIDADES DE TEMPERATURA\n");
                System.out.println("Que vas a convertir?: ");
                System.out.println("1. Celcius a Fahrenheit");
                System.out.println("2. Fahrenheit a Celcius");
                System.out.println("3. Salir");
                int option = input.nextInt();

                double value;
                double result;

                switch (option) {
                    case 1:
                        System.out.println("Celcius a Fahrenheit");
                        System.out.println("Ingresa la temperatura en Celcius: ");
                        value = input.nextDouble(); 
                        result = (value * (9/5))+32;
                        System.out.println(value + "° Celcius es igual a " + result + "° Fahrenheit.");
                        break;
                    case 2:
                        System.out.println("Fahrenheit a Celcius");
                        System.out.println("Ingresa la temperatura en Fahrenheit: ");
                        value = input.nextDouble();
                        result = (value - 32) / (9 / 5);
                        System.out.println(value + "° Fahrenheit es igual a " + result + "° Celcius.");
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
