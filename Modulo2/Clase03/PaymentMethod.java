/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Sistema de gestión de pagos
*/
package Modulo2.Clase03;

public interface PaymentMethod {
    void paymentProcess(double amount);
    String getDetails();
    boolean checkAmount(double mount);
}
