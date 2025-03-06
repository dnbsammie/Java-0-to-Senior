/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Cálculo de Intereses (simple y compuesto)
*/
package Modulo1.Clase04;

import java.util.Scanner;

public class Ejercicio9 {
     public static double calculateSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, double time, int n) {
        double amount = principal * Math.pow(1 + (rate / (n * 100)), n * time);
        return amount - principal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seleccione el tipo de interés:");
        System.out.println("1. Interés Simple");
        System.out.println("2. Interés Compuesto");
        System.out.print("Ingresa el número de la opción (1-2): ");
        int choice = input.nextInt();

        double principal, rate, time, result;
        int n;

        switch (choice) {
            case 1:
                System.out.print("Ingresa el monto de capital: ");
                principal = input.nextDouble();
                System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
                rate = input.nextDouble();
                System.out.print("Ingresa el tiempo (en años): ");
                time = input.nextDouble();

                result = calculateSimpleInterest(principal, rate, time);
                System.out.println("El interés simple es: " + result);
                break;

            case 2:
                System.out.print("Ingresa el monto de capital: ");
                principal = input.nextDouble();
                System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
                rate = input.nextDouble();
                System.out.print("Ingresa el tiempo (en años): ");
                time = input.nextDouble();
                System.out.print("Ingresa el número de veces que se aplica el interés por año: ");
                n = input.nextInt();

                double amount = principal * Math.pow(1 + (rate / (n * 100)), n * time);
                result = calculateCompoundInterest(principal, rate, time, n);

                System.out.println("El monto total después de " + time + " años es: " + amount);
                System.out.println("El interés compuesto es: " + result);
                break;

            default:
                System.out.println("Opción inválida.");
        }

        input.close();
    }
}
