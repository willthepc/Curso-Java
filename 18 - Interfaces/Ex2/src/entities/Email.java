public class Email implements Notificator{
    public Email() {}

    public void Enviar(String text, String destinatario) {
        System.out.println("Meio: E-mail\n" + "Destinatario: " + destinatario + "\n" + "Mensagem: " + text+ "\n");
    }

    public boolean Validacao(String destinatario) {
        if (destinatario.contains("@")) {
            return true;
        } else {
            return false;
        }
    }
}
