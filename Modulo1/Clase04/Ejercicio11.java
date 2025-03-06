/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Cálculo de Índice de Masa Corporal
*/
package Modulo1.Clase04;

import java.util.Scanner;

public class Ejercicio11 {
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String determineCategory(double bmi) {
        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Peso normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Sobrepeso";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obesidad grado I";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obesidad grado II";
        } else {
            return "Obesidad grado III";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double weight = input.nextDouble();
        System.out.print("Ingresa tu altura en metros (Separalos con una ,): ");
        double height = input.nextDouble();

        double bmi = calculateBMI(weight, height);
        String category = determineCategory(bmi);

        System.out.printf("Tu IMC es: %.2f\n", bmi);
        System.out.println("Categoría: " + category);

        input.close();
    }
}
