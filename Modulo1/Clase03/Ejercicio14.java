/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Realice un programa en el que ingrese un número y muestre el cubo. 
    Repita el proceso hasta que se introduzca un valor negativo.
*/
package Clase03;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;

        do{
            System.out.println("Introudce un numero. Si quieres salir, introduce un negativo...");
            number =input.nextInt();
            if(number >= 0){
                int cube = (int) Math.pow(number, 3);
                System.out.println("El cubo de "+ number + " es: "+cube);
            }
        }while(number>=0);

        System.out.println("Ingresaste un numero negativo...");

        input.close();
    }
}
