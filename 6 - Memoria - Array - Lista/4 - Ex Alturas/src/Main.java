import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas pessoas serão digitadas: ");
        int n = sc.nextInt() + 1;

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        List<String> listaMenor = new ArrayList<>();

        double sumAltura = 0.0;
        int contIdade = 0;

        for (int i = 1; i < n; i++) {
            System.out.println();
            System.out.println("Dados da " + i + "° pessoa");
            System.out.println("Nome:");
            nome[i] = sc.next();

            System.out.println("Idade:");
            idade[i] = sc.nextInt();
            if (idade[i] < 16) {
                contIdade++;
                 listaMenor.add(nome[i]);
            }

            System.out.println("Altura:");
            altura[i] = sc.nextDouble();
            sumAltura += altura[i];
        }

        for (int u = 1; u < n; u++) {
            System.out.println("Nome: " + nome[u]);
            System.out.println("Idade: " + idade[u]);
            System.out.println("Altura: " + altura[u]);
        }

        System.out.println();
        System.out.println("Altura média: " + (sumAltura / (n - 1)));
        System.out.println("Pessoas com menos de 16 anos: " + (contIdade / 100));
        for (String k : listaMenor) {
            System.out.println(k);
        }

    }
}