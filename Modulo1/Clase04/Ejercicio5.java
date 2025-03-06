/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Cálculo de Promedio de tres números
*/
package Modulo1.Clase04;

import java.util.Scanner;

public class Ejercicio5 {
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = input.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double num3 = input.nextDouble();

        double average = calculateAverage(num1, num2, num3);

        System.out.println("El promedio de los tres números es: " + average);

        input.close();
    }
}
