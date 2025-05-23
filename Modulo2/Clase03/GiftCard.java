/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Sistema de gestión de pagos
*/
package Modulo2.Clase03;

public class GiftCard implements PaymentMethod {
    @Override
    public void paymentProcess(double amount) {
        System.out.println("Pago procesado con tarjeta de regalo por " + amount);
    }
    
    @Override
    public String getDetails() {
        return "Pago mediante tarjeta de regalo";
    }

    @Override
    public boolean checkAmount(double amount) {
        return amount >0 && amount <=500;
    }
}