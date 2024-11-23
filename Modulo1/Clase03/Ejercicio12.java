/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba una función en el que pueda ingresar el peso de la sandía en kilogramos y la respuesta sea:
    - SI en caso de que se pueda dividir este peso en números pares
    - NO de lo contrario.
*/

package Clase03;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sebastian y Adriana quieren dividir su sandia por numero par.\nMenciona el peso de la sandia: ");
        int watermelon = input.nextInt();
        if (watermelon % 2 == 0) {
            System.out.println("\nSI, la sandia se puede dividir en par");
            System.out.println("Por partes iguales, deberian tener: " + (watermelon/2));
            System.out.println("Sino, estas son otras formas de dividirla\n");
            for(int i = 1; i<watermelon/2;i++){
                int sebastian=i;
                int adriana= watermelon-i;
                System.out.println(sebastian +" y "+ adriana);
            }

        } else {
            System.out.println("NO, la sandia no se divide en impar");
        }
        input.close();
    }
}
