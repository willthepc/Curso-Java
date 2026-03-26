import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Notificator> entidades = new ArrayList<>();

        entidades.add(new Email());
        entidades.add(new SMS());
        entidades.add(new PushNotification());

        System.out.println("Texto: ");
        String text = sc.next();
        System.out.println("Destinatário: ");
        String destinatario = sc.next();

        boolean encontrou = false;
        for(Notificator teste : entidades) {
            boolean resultado = teste.Validacao(destinatario);
            if (resultado == true) {
                teste.Enviar(text, destinatario);
                encontrou = true;
                break;
            }
        }

        if (encontrou == false) {
            System.out.println("Nenhum destinatário encontrado.");
        }

    }
}
