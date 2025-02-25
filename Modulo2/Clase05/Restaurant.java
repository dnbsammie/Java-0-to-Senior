/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Gestión de restaurante
*/

package Modulo2.Clase05;

public class Restaurant {
    private Kitchen kitchen;
    private Waiter waiter;
    private Cashier cashier;

    public Restaurant(Kitchen kitchen, Waiter waiter, Cashier cashier) {
        this.kitchen = kitchen;
        this.waiter = waiter;
        this.cashier = cashier;
    }

    public void operateRestaurant() {
        kitchen.prepareDish();
        waiter.serve();
        cashier.paymentProcess();
    }
}
