/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Sistema de gestión de pagos
*/

package Modulo2.Clase03;

public class Bitcoin implements PaymentMethod {
    @Override
    public void paymentProcess(double amount) {
        System.out.println("Pago procesado en Bitcoin por " + amount);
    }
    
    @Override
    public String getDetails() {
        return "Pago en Bitcoin";
    }

    @Override
    public boolean checkAmount(double amount) {
        return amount >= 0.001;
    }
}