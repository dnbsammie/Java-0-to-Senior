/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la cantidad de unidades que le compren.
*/
package Modulo1.Clase03;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el numero de camisas a comprar: ");
        int sale = input.nextInt();
        if(sale >= 1 && sale <=50){
            System.out.println("Precio por unidad: $50.000");
        } else if(sale > 50){
            System.out.println("Precio por unidad: $45.000");
        }else if(sale > 100){
            System.out.println("Precio por unidad: $40.000");
        }else if(sale > 150){
            System.out.println("Precio por unidad: $35.000");
        }else if(sale > 200){
            System.out.println("Precio por unidad: $25.000");
        }
        input.close();
    }
}
