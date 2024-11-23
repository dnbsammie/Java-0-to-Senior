/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Esta sucesión comienza con los números 0 y 1. El siguiente miembro se calcula como la suma de los dos inmediatamente anteriores.
    Crea un programa reciba un número (N) del usuario y muestre los primeros N números de sucesión.
*/
package Clase03;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el número para la sucesión de Fibonacci: ");
        int N = input.nextInt();

        System.out.println("Los numeros " + N + " de la sucesion de Fibonacci son: ");

        long a = 0, b = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            long next = a + b; 
            a = b; 
            b = next; 
        }

        input.close();
    }
}
