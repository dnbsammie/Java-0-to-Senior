/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Sistema de gestión de pagos
*/
package Modulo2.Clase03;

public class WireTransfer implements PaymentMethod {
    @Override
    public void paymentProcess(double amount) {
        System.out.println("Pago procesado mediante transferencia bancaria por " + amount);
    }
    
    @Override
    public String getDetails() {
        return "Pago mediante transferencia bancaria";
    }

    @Override
    public boolean checkAmount(double amount) {
        return amount >= 10;
    }
}