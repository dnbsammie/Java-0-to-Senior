/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Calculadora de Inventario (Clase Product)
*/

package Modulo1.Clase08;

public class Product {
    String name;
    int quantity;
    double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Producto: " + name + " | Cantidad: " + quantity + " | Precio: $" + price;
    }
}