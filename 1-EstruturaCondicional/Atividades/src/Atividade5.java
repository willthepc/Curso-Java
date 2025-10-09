import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precoProduto = 30.0f;

        System.out.println("Quantos comprados? ");
        int qtdComprada = sc.nextInt();
        System.out.println("Quanto de dinheiro? ");
        float dinheiro = sc.nextFloat();

        float valorFinal = precoProduto * qtdComprada;
        if (valorFinal > dinheiro) {
            System.out.println("Falta " + (valorFinal - dinheiro));
        } else {
            System.out.println("Troco: " + (dinheiro - valorFinal));
        }
    }
}
