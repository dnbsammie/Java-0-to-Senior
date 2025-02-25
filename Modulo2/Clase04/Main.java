/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Gestión de notificaciones
*/

package Modulo2.Clase04;

public class Main {
    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.getNotification("email");
        email.send("Hola desde el correo");

        Notification sms = factory.getNotification("sms");
        sms.send("Hola desde SMS");

        Notification push = factory.getNotification("push");
        push.send("Hola desde notificación push");
    }
}
