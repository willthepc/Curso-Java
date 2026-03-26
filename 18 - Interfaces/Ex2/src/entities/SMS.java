public class SMS implements Notificator{
    public SMS(){}

    public void Enviar(String text, String destinatario) {
        System.out.println("Meio: SMS\n" + "Destinatario: " + destinatario + "\n" + "Mensagem: " + text+ "\n");
    }

    public boolean Validacao(String destinatario) {
        if (destinatario.length() == 11) {
            return true;
        } else {
            return false;
        }
    }
}
