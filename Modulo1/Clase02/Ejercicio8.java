/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: Area y perimetro de un Rectangulo
*/
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCalculo de un Rectangulo");

        System.out.println("\n-Introduce el ancho del rectangulo: ");
        double ancho = entrada.nextDouble();

        System.out.println("\n-Introduce la longitud del rectangulo: ");
        double longitud = entrada.nextDouble();

        System.out.printf("Perimetro del rectangulo: %2f%n", 2*(longitud+ancho) );
        System.out.printf("Area del rectangulo: %2f%n", longitud * ancho);

        entrada.close();
    }
}
