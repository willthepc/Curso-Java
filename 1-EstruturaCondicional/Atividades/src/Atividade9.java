import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua escolha: ");
        int codigo = sc.nextInt();
        System.out.println("Agora a quantidade comprada: ");
        int qtd = sc.nextInt();
        if(codigo == 1) {
            System.out.println("Valor a pagar: R$ " + (5 * qtd));
        } else if (codigo == 2) {
            System.out.println("Valor a pagar: R$ " + (3.5 * qtd));
        } else if (codigo == 3) {
            System.out.println("Valor a pagar: R$ " + (4.8 * qtd));
        } else if (codigo == 4) {
            System.out.println("Valor a pagar: R$ " + (8.9 * qtd));
        } else if (codigo == 5) {
            System.out.println("Valor a pagar: R$ " + (7.32 * qtd));
        } else {
            System.out.println("Opção indisponível...");
        }
    }
}
