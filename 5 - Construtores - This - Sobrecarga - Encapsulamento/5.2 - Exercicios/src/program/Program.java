package program;
import entities.Conta;

import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        String holder = sc.next();

        System.out.println("Ih there na initial deposit (y/n)?");
        String option = sc.next();
        if (option == "y") {
            System.out.println("Enter initial deposit value:");
            double initialDeposit = sc.nextDouble();

            Conta conta = new Conta(number, holder, initialDeposit);

            System.out.println("Account data:");
            System.out.println(conta);
        } else {
            Conta conta = new Conta(number, holder);
        }

        Conta conta = new Conta(number, holder);

        System.out.println("Account data:");
        System.out.println(conta);

        System.out.println("Enter deposit value: ");
        conta.deposit(sc.nextDouble());
        System.out.println(conta);

        System.out.println("Enter withdraw value: ");
        conta.withdraw(sc.nextDouble());
        System.out.println(conta);

        sc.close();
    }
}
