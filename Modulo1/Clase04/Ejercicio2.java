/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Verificación de Palíndromos
*/
package Modulo1.Clase04;

import java.util.Scanner;

public class Ejercicio2 {
    public static boolean isPalindrome(String word){

        word = word.replaceAll("[\\W_]","").toLowerCase();
        int start = 0;
        int end = word.length() - 1;

        while (start<end) {
            if(word.charAt(start)!= word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa una cadena de wordo: A man, a plan, a canal, Panama");
        String word = input.nextLine();
        if(isPalindrome(word)){
            System.out.println("La cadena es un palíndromo.");
        } else{
            System.out.println("La cadena no es un palindromo. ");
        }
        input.close();
    }
}
