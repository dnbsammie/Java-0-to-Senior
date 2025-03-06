/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Gestión de notificaciones
*/
package Modulo2.Clase04;

public class MailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando correo: " + message);
    }    
}
