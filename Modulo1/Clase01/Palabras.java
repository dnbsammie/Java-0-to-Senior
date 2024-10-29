/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: Pida tres palabras por parte del usuario y la salida de las tres palabras en la pantalla.
*/
import java.util.Scanner;

public class Palabras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la primer palabra: ");
        String palabra1 = entrada.nextLine();

        System.out.println("Introduce la segunda palabra: ");
        String palabra2 = entrada.nextLine();

        System.out.println("Introduce la tercera palabra: ");
        String palabra3 = entrada.nextLine();

        System.out.println("Las palabras son: "+ palabra1+" " + palabra2 + " "+palabra3);
        entrada.close();
    }
}
