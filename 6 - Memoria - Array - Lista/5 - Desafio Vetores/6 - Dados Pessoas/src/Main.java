import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will be write: ");
        int n = sc.nextInt();
        double[] Altura = new double[n];
        String[] Genero = new String[n];

        double menorAltura = 0.0;
        double maiorAltura = 0.0;
        double sumMulheres = 0.0;
        int numeroHomens = 0;
        int numeroMulheres = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Altura da " + (i + 1) + " pessoa: ");
            Altura[i] = sc.nextDouble();

            System.out.println("Genero da " + (i + 1) + " pessoa: ");
            Genero[i] = sc.next();
            if (Objects.equals(Genero[i], "m") || Objects.equals(Genero[i], "M")) {
                numeroHomens++;
            }
            if (Objects.equals(Genero[i], "f") || Objects.equals(Genero[i], "F")) {
                sumMulheres += Altura[i];
            }
            if (Objects.equals(Genero[i], "f") || Objects.equals(Genero[i], "F")) {
                numeroMulheres++;
            }
            System.out.println();
        }

        for (double y : Altura) {
            if (y > maiorAltura) {
                maiorAltura = y;
            }
        }
        double media = sumMulheres / numeroMulheres;
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Média das alturas: " + media);
        System.out.println("Números de homens: " + numeroHomens);


    }
}