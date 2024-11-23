/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Encontrar elementos unicos en una lista de numeros
*/
package Clase05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        HashSet<Integer> uniqueNumbers = new HashSet<>(); 
        HashSet<Integer> duplicates = new HashSet<>();  

        System.out.print("Ingresa la cantidad de números que quieres ingresar: ");
        int n = input.nextInt();

        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            numbers.add(num);
        }
        for (int num : numbers) {
            if (!uniqueNumbers.add(num)) {
                duplicates.add(num);  
            }
        }
        uniqueNumbers.removeAll(duplicates);
        System.out.println("Los números únicos son:");
        for (int num : uniqueNumbers) {
            System.out.println(num);
        }

        input.close();
    }
}
