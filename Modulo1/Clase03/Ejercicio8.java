/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa que permita ingresar un número (va a representar la cantidad de años) y de como respuesta la etapa en la que se encuentra la persona 
*/
package Modulo1.Clase03;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int age = input.nextInt();

        if(age >= 0 && age <=5){
            System.out.println("Primera infancia");
        } else if(age <=11){
            System.out.println("Infancia");
        } else if(age <=18){
            System.out.println("Adolescencia");
        } else if(age <=26){
            System.out.println("Juventud");
        } else if(age<=59){
            System.out.println("Adultez");
        } else if(age > 59){
            System.out.println("Persona Mayor");
        }
        input.close();
    }
}
