/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Escriba un programa que genere 120 números aleatorios entre -100 y 100. 
    Imprime los siguientes cálculos:
    - Sumar los valores positivos.
    - Sumar los valores negativos.
    - Calcule la media de los números negativos.
    - Calcule la media de los números positivos.
    - Cuente la cantidad de ceros.
*/

package Clase03;

import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        Random rand = new Random();
        // Imprime los siguientes cálculos:
        int posNumber = 0;
        int negNumber = 0;
        int posAmount = 0;
        int negAmount = 0;
        int zeroAmount = 0;

        for(int i = 0; i <= 120; i++){
            int number = rand.nextInt(201) - 100;
            System.out.print(number + " ");

            if (number > 0){
                posNumber += number;
                posAmount++;
            } else if (number < 0){
                negNumber += number;
                negAmount++;
            } else{
                zeroAmount++;
            }
        }

        double posAverage = posAmount > 0 ? (double) posNumber / posAmount: 0;
        double negAverage = negAmount > 0 ? (double) negNumber / negAmount: 0;

        System.out.println("\nNumeros Calculados:");
        System.out.println("Cantidad de los positivos: " + posAmount);
        System.out.println("Cantidad de los negativos: " + negAmount);
        System.out.println("Suma de los positivos: " + posNumber);
        System.out.println("Suma de los negativos: " + negNumber);
        System.out.println("Media de los positivos: " + posAverage);
        System.out.println("Media de los negativos: " + negAverage);
        System.out.println("Cantidad de 0: " + zeroAmount);
    }
}
