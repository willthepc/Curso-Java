import java.util.Objects;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        int total = 0;

        int tipoC = 0;
        int tipoR = 0;
        int tipoS = 0;

        int cobaiaC = 0;
        int cobaiaR = 0;
        int cobaiaS = 0;

        for (int i = 0; i < casos; i++) {
            System.out.println("Quantidade de cobaias: ");
            int cobaia = sc.nextInt();
            total += cobaia;


            System.out.println("Tipo de Cobaia: ");
            String tipo = sc.next();


            if (Objects.equals(tipo, "c") || Objects.equals(tipo, "C")) {
                cobaiaC += cobaia;
            }

            if (Objects.equals(tipo, "r") || Objects.equals(tipo, "R")) {
                cobaiaR += cobaia;
            }

            if (Objects.equals(tipo, "s") || Objects.equals(tipo, "S")) {
                cobaiaS += cobaia;
            }
        }
        System.out.println("Total: " + total);
        System.out.println("Total de Coelhos: " + cobaiaC);
        System.out.println("Total de Ratos: " + cobaiaR);
        System.out.println("Total de Sapos: " + cobaiaS);
    }
}
