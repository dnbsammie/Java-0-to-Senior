/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: Programa que calcule correctamente el precio por kilo del producto.
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        double precioPernilg = 5.95;
        double precioPernilK = 29.75;

        System.out.println("Precio calculado por kilo: $" + (precioPernilg * 1000 / 100));
        System.out.println("Precio dado por el vendedor: $" + precioPernilK);

        // Verificamos si el precio es correcto
        if ((precioPernilg * 1000 / 100) == precioPernilK) {
            System.out.println("El precio es correcto.");
        } else {
            System.out.println("El precio NO es correcto.");
        }

    }
}