/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa que permita ingresar tres números (representan la longitud de una línea) y compruebe si con estos números se puede formar un triángulo.
*/
package Clase03;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un numero pra la logitud a: ");
        double a = input.nextDouble();
        
        System.out.print("Ingresa un numero pra la logitud b: ");
        double b = input.nextDouble();
        
        System.out.print("Ingresa un numero pra la logitud c: ");
        double c = input.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Si, puedes formar un triangulo");
        } else {
            System.out.println("No puedes formar un triangulo");
        }
        input.close();
    }
}
