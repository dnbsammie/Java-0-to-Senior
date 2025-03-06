/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa que permita ingresar un número real e identifique si el número es negativo, positivo o cero.
*/
package Modulo1.Clase03;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un numero real: ");
        double number = input.nextDouble();

        if(number>0){
            System.out.println("El numero es positivo... ");
        } else if(number <0){
            System.out.println("El numero es negativo...");
        } else{
            System.out.println("Es Cero");
        }

        input.close();
    }    
}