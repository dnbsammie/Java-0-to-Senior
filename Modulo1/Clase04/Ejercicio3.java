/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Cálculo de Factorial
*/
package Modulo1.Clase04;

import java.util.Scanner;

public class Ejercicio3 {
    public static String calculateFactorial(int n) {
        long result = 1;
        StringBuilder sequence = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            result *= i;
            sequence.append(i);
            if (i > 1) {
                sequence.append(" * ");
            }
        }
        return n + "! = " + sequence.toString() + " = " + result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un numero entero positivo: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("El numero debe ser un entero positivo.");
        } else {
            String result = calculateFactorial(n);
            System.out.println(result);
        }
        input.close();
    }
}
