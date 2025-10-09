import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        float num1 = sc.nextFloat();
        System.out.println("Digite outra nota: ");
        float num2 = sc.nextFloat();
        float soma = num1 + num2;
        System.out.println("Nota final: " + soma);
        if (soma < 60.0) {
            System.out.println("O aluno foi REPROVADO.");
        } else {
            System.out.println("O aluno foi APROVADO.");
        }
    }
}