/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: Conversion de temperaturas

    Fahrenheit = Celsius * 9/5 + 32
    Kelvin = Celsius + 273.15
*/
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Conversor de unidades: °");

        System.out.println("Introduce la temperatura en grados Celsius: ");
        double celsius = entrada.nextDouble();

        System.out.printf("Temperatura en Fahrenheit: %.2f°F%n", celsius*9/5+32);
        System.out.printf("Temperatura en Kelvin: %.2f K%n", celsius+273.15);

        entrada.close();
    }
}
