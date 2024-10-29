/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: ¿Qué precio tenían antes del descuento?
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        double precioPago = 34.00;
        double descuento = 0.15;

        System.out.printf("El precio original de los pantalones: $%.2f%n", precioPago/(1-descuento));
    }
}
