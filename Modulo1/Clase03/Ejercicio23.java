/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Realizar un programa que imprima un diamante usando caracteres de texto. El programa debe pedir al usuario el tamaño del diamante, el cual debe ser un número entero positivo impar.
    Ten en cuenta que la linea de asteriscos (*) de la fila central es la mas grande y debe estar alineada a la parte izquierda de la pantalla y debe tener del tamaño del número dado. El resto de las lineas deben quedar los asteriscos centrados teniendo como base la linea central. En caso de que el número ingresado no sea válido, se le debe informar el usuario el caso que no está cumpliendo..
*/
package Clase03;

import java.util.Scanner;

public class Ejercicio23 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el tamaño del diamante (un número impar positivo): ");
        int size = input.nextInt();

        if (size <= 0 || size % 2 == 0) {
            System.out.println("El tamaño debe ser un número positivo impar.");
        } else {

            printDiamond(size);
        }
        input.close();
    }

    public static void printDiamond(int size) {
        int half = size / 2;

        for (int i = 0; i <= half; i++) {
            for (int j = 0; j < half - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = half - 1; i >= 0; i--) {
            for (int j = 0; j < half - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
