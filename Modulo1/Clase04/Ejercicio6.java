/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Conversión de Unidades
*/
package Clase04;

import java.util.Scanner;

public class Ejercicio6 {
    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    public static double gramsToKilograms(double grams) {
        return grams / 1000;
    }

    public static double kilogramsToGrams(double kilograms) {
        return kilograms * 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selecciona el tipo de conversión:");
        System.out.println("1. Metros a Kilómetros");
        System.out.println("2. Kilómetros a Metros");
        System.out.println("3. Gramos a Kilogramos");
        System.out.println("4. Kilogramos a Gramos");
        System.out.println("Ingresa el número de la opción (1-4): ");
        int choice = input.nextInt();

        double result = 0;
        double value = 0;
        switch (choice) {
            case 1:
                System.out.print("Ingresa el valor en metros: ");
                value = input.nextDouble();
                result = metersToKilometers(value);
                System.out.println(value + " metros son " + result + " kilómetros.");
                break;
            case 2:
                System.out.print("Ingresa el valor en kilómetros: ");
                value = input.nextDouble();
                result = kilometersToMeters(value);
                System.out.println(value + " kilómetros son " + result + " metros.");
                break;
            case 3:
                System.out.print("Ingresa el valor en gramos: ");
                value = input.nextDouble();
                result = gramsToKilograms(value);
                System.out.println(value + " gramos son " + result + " kilogramos.");
                break;
            case 4:
                System.out.print("Ingresa el valor en kilogramos: ");
                value = input.nextDouble();
                result = kilogramsToGrams(value);
                System.out.println(value + " kilogramos son " + result + " gramos.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
        input.close();
    }
}
