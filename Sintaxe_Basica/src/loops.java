import java.util.ArrayList;
import java.util.Scanner;

public class loops {
    public static void main(String [] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fer");
        nomes.add("Leo");
        nomes.add("João");
        nomes.add("Maria");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("Sistema interrompido.");
                break;
            }
            else if(num == 1) {
                System.out.println("GG");
            }
        }

        int contador = 0;
        while(contador < 10) {
            System.out.println("Estou no while...");
            contador++;
        }
    }
}
