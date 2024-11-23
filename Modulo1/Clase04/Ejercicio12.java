/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Conversión de segundos
*/
package Clase04;

import java.util.Scanner;

public class Ejercicio12 {
    public static void convertSeconds(long totalSeconds) {
        long days = totalSeconds / (24 * 3600);
        totalSeconds = totalSeconds % (24 * 3600);
        long hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        System.out.println("Días: " + days);
        System.out.println("Horas: " + hours);
        System.out.println("Minutos: " + minutes);
        System.out.println("Segundos: " + seconds);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de segundos: ");
        long totalSeconds = input.nextLong();

        convertSeconds(totalSeconds);

        input.close();
    }
}
