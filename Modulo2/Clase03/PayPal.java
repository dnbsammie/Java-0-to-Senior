/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Sistema de gestión de pagos
*/

package Modulo2.Clase03;

public class PayPal implements PaymentMethod{
    @Override
    public void paymentProcess(double amount) {
        System.out.println("Pago procesado mediante PayPal por " + amount);
    }

    @Override
    public String getDetails(){
        return "Pago mediante Paypal";
    }

    @Override
    public boolean checkAmount(double amount){
        return amount >= 1 && amount <=10000;
    }
}
