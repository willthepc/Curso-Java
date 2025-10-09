import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float preco = 50.0f;
        float tempo = 100.0f;
        System.out.println("Digite o tempo que ficou: ");
        float tempoCliente = sc.nextFloat();

        if (tempoCliente > tempo) {
            float sub = tempoCliente - tempo;
            float novoPreco = 50 + (sub * 2);
            System.out.println("Preço a pagar: " + novoPreco);
        } else {
            System.out.println(("Preço a pagar: " + preco));
        }

    }
}
