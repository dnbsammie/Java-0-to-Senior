/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Gestión de restaurante
*/

package Modulo2.Clase05;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();
        Cashier cashier = new Cashier();

        Restaurant restaurant = new Restaurant(kitchen, waiter, cashier);
        restaurant.operateRestaurant();
    }
}
