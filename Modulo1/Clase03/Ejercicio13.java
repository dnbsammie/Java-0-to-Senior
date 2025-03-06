/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Tres hermanos acuerdan reunirse. Los hermanos son identificados por los siguientes números: 1 para el mayor, 2 para el del medio y 3 para el menor.
    Cuando llega la hora de la reunión, uno de los hermanos va tarde. Dados los números de los hermanos que llegan a tiempo, determine el número del hermano que llegará tarde.
*/
package Modulo1.Clase03;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tres hermanos acuerdan reunirse. Los hermanos son identificados por los siguientes números: \n1 para el mayor, 2 para el del medio y 3 para el menor.");
        System.out.println("Ingresa los numeros de los hermanos que llegan temprano: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int late = 6 - (a+b);

        String[] names = {"", "Mayor", "del Medio", "Menor"};

        System.out.println("El hermano que llega tarde es: "+ late + ", el " + names[late]);
        input.close();
    }
}