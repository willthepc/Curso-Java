public class PushNotification implements Notificator {
    public PushNotification(){}

    public void Enviar(String text, String destinatario) {
        System.out.println("Enviando alerta para o dispositivo...\n");
    }

    public boolean Validacao(String destinatario) {
        if (destinatario != null) {
            System.out.println("Procurando destino...");
            return false;
        } else {
            return true;
        }
    }
}
