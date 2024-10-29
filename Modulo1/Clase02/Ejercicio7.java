/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: Calculadora Básica
*/
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n CALCULADORA BASICA");
        System.out.println("Introduce tu primer numero: ");
        double num1 = entrada.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.printf("Suma: %.2f%n", num1 + num2);
        System.out.printf("Resta: %.2f%n", num1 - num2);
        System.out.printf("Multiplicación: %.2f%n", num1 * num2);
        System.out.printf("División: %.2f%n", (num2 != 0) ? (num1 / num2) : Double.NaN);

        entrada.close();
    }
}
