import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int num = 0;
        int qtd = 0;
        while(num >= 0) {
            soma += num;
            num = sc.nextInt();
            if(num > 0) {
                qtd++;
            }
        }
        System.out.println("Soma: "+ soma);
        System.out.println("Quantidade: " + soma/qtd);
    }

}
