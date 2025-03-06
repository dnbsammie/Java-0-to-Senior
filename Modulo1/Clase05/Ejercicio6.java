/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Contar la frecuencia de palabras en un texto.
*/
package Modulo1.Clase05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un texto: ");
        String text = input.nextLine();

        String[] words = text.split("\\W+"); 
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase(); 
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nFrecuencia de las palabras:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        input.close();
    }
}
