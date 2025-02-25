/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Gestión de notificaciones
*/

package Modulo2.Clase04;

public class NotificationFactory {
    public Notification getNotification(String channel) {
        if (channel == null) {
            return null;
        }
        switch (channel.toLowerCase()) {
            case "email":
                return new MailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Canal no soportado: " + channel);
        }
    }
}
