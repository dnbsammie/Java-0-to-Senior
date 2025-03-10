/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Números Primos
*/
package Modulo1.Clase04;

import java.util.Scanner;

public class Ejercicio4 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = input.nextInt();
        if (isPrime(n)) {
            System.out.println("El número " + n + " es primo.");
        } else {
            System.out.println("El número " + n + " no es primo.");
        }
        input.close();
    }
}
