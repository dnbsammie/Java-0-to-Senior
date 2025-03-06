/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Generación de Tablas de Multiplicar
*/
package Modulo1.Clase04;

import java.util.Scanner;

public class Ejercicio10 {
        public static void generateMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", number, i, number * i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número para generar la tabla: ");
        int number = input.nextInt();

        generateMultiplicationTable(number);

        input.close();
    }
}
