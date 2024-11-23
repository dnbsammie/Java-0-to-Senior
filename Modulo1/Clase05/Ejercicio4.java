/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Verificación de duplicados en una lista de correos electrónicos.
*/
package Clase05;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> emailSet = new HashSet<>();
        boolean hasDuplicates = false;

        System.out.print("Ingresa la cantidad de correos electrónicos: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el correo electrónico #" + (i + 1) + ": ");
            String email = input.nextLine();

            if (!emailSet.add(email)) {
                System.out.println("Correo electrónico duplicado encontrado: " + email);
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No se encontraron correos electrónicos duplicados.");
        }

        input.close();
    }
}
