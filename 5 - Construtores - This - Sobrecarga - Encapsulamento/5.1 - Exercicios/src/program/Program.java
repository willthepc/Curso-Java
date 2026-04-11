package program;
import entities.Conta;

import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Enter account number: ");
        conta.number = sc.nextInt();

        System.out.println("Enter account holder: ");
        conta.holder = sc.next();

        System.out.println("Ih there na initial deposit (y/n)?");
        if (Objects.equals(sc.next(), "y")) {
            System.out.println("Enter initial deposit value:");
            conta.balance = sc.nextDouble();
            System.out.println("Account data:");
            System.out.println(conta);
        } else {
            System.out.println("Account data:");
            System.out.println(conta);
        }

        System.out.println("Enter deposit value: ");
        conta.deposit(sc.nextDouble());
        System.out.println(conta);

        System.out.println("Enter withdraw value: ");
        conta.withdraw(sc.nextDouble());
        System.out.println(conta);

        sc.close();
    }
}
