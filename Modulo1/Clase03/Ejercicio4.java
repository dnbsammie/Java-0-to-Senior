/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa que permita ingresar una letra e identifique si la letra es mayúscula o minúscula.
*/
package Modulo1.Clase03;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa una letra: ");
        char letter=input.next().charAt(0);

        if(Character.isUpperCase(letter)){
            System.out.println("Tu letra es mayuscula");
        } else if(Character.isLowerCase(letter)){
            System.out.println("Tu letra es miniscula");
        }else{
            System.out.println("Tu caracter no es una letra");
        }

        input.close();
    }
}