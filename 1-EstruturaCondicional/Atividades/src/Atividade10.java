import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário da pessoa: ");
        float salario = sc.nextFloat();
        if (salario <= 1000.0) {
            System.out.println("Novo salário: " + (salario + (salario * 20/100)));
            System.out.println("Aumento: " + salario * 20/100);
            System.out.println("Porcentagem: 20%");
        } else if (salario >= 1000.01 && salario <= 3000.00) {
            System.out.println("Novo salário: " + (salario + (salario * 15/100)));
            System.out.println("Aumento: " + salario * 15/100);
            System.out.println("Porcentagem: 15%");
        } else if (salario >= 3000.01 && salario <= 8000.00) {
            System.out.println("Novo salário: " + ((salario * 10/100) + salario));
            System.out.println("Aumento: " + salario * 10/100);
            System.out.println("Porcentagem: 10%");
        } else {
            System.out.println("Novo salário: " + ((salario * 5/100) + salario));
            System.out.println("Aumento: " + salario * 5/100);
            System.out.println("Porcentagem: 5%");
        }
    }
}
