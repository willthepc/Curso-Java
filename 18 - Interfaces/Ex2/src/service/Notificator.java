public interface Notificator {
    void Enviar(String text, String destinatario);
    boolean Validacao(String destinatario);
}
