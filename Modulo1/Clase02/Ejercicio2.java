/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Programa que calcule correctamente el precio por kilo del producto.
*/

package Modulo1.Clase02;

public class Ejercicio2 {
    public static void main(String[] args) {
        double priceHamg = 5.95;
        double priceHamK = 29.75;

        System.out.println("Precio calculado por kilo: $" + (priceHamg * 1000 / 100));
        System.out.println("Precio dado por el vendedor: $" + priceHamK);

        if ((priceHamg * 1000 / 100) == priceHamK) {
            System.out.println("El precio es correcto.");
        } else {
            System.out.println("El precio NO es correcto.");
        }

    }
}