/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    ¿Qué precio tenían antes del descuento?
*/
package Modulo1.Clase02;

public class Ejercicio6 {
    public static void main(String[] args) {
        double pricePayment = 34.00;
        double discount = 0.15;

        System.out.printf("El precio original de los pantalones: $%.2f%n", pricePayment/(1-discount));
    }
}
