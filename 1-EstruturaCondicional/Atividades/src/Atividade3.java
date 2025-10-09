import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite um número: ");
        int num3 = sc.nextInt();
        int menor2 = Math.min(num1, num2);
        int menor3 = Math.min(menor2, num3);
        System.out.println("Menor número: " + menor3);
    }
}
