/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Cálculo de Potencias
*/
package Clase04;

import java.util.Scanner;

public class Ejercicio7 {
    public static long calculatePower(long base, long exponent) {
        if (exponent == 0) {
            return 1;
        }

        long result = 1;
        for (long i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        long base = input.nextLong();

        System.out.print("Ingresa el exponente: ");
        long exponent = input.nextLong();

        long result = calculatePower(base, exponent);
        System.out.println(base + " elevado a la potencia de " + exponent + " es: " + result);

        input.close();
    }
}
