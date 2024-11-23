/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa en el que ingrese un número y le diga si es positivo o negativo. 
    Repita el proceso hasta que se ingrese el número cero.
*/
package Clase03;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        do{
            System.out.println("Introduce un numero: ");
            number = input.nextInt();

            if(number > 0){
                System.out.println("Tu numero es positivo");
            } else if(number < 0){
                System.out.println("Tu numero es negativo");
            } else{
                System.out.println("Tu numero es 0. Saliendo...");
            }
        } while(number != 0);


        input.close();
    }
}
