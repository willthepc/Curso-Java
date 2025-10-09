import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qtd de glicose: ");
        float glicose = sc.nextFloat();

        if(glicose <= 100.0) {
            System.out.println("Classificação: Normal");
        } else if (glicose >= 101.0 && glicose <= 140.0) {
            System.out.println("Classificação: Elevado");
        } else {
            System.out.println("Classificação: Diabetes");
        }
    }
}
