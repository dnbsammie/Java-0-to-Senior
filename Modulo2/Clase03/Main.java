/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Sistema de gestión de pagos
*/
package Modulo2.Clase03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PaymentMethod> paymentMethods = new ArrayList<>();
        paymentMethods.add(new CreditCard());
        paymentMethods.add(new PayPal());
        paymentMethods.add(new WireTransfer());
        paymentMethods.add(new Bitcoin());
        paymentMethods.add(new GiftCard());

        double[] amounts = {50, 7000, 5, 0.002, 300};

        for (int i = 0; i < paymentMethods.size(); i++) {
            PaymentMethod paymentMethod = paymentMethods.get(i);
            double amount = amounts[i];
            
            System.out.println("Método de pago: " + paymentMethod.getDetails());
            if (paymentMethod.checkAmount(amount)) {
                paymentMethod.paymentProcess(amount);
            } else {
                System.out.println("Monto no válido: " + amount);
            }
            System.out.println();
        }
    }
}
