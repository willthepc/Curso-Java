package Calculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do dólar: ");
        double dolar = sc.nextDouble();
        System.out.println("Digite quantos dólares serão comprados: ");
        double qtd = sc.nextDouble();
        System.out.println(classs.Trans(dolar, qtd));
    }
}
