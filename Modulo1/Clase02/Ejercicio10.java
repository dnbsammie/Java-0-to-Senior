/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: Media Aritmetica
*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCalculadora media aritmetica");
        System.out.println("Introduce el primer numero: ");
        double num1 = entrada.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Introduce el tercero numero: ");
        double num3 = entrada.nextDouble();

        System.out.printf("La media aritmética de los tres números es: %.2f%n", (num1 + num2 + num3) / 3);

        entrada.close();
    }
}
