package application;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;
import org.w3c.dom.DOMImplementation;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.println("Insira o número da conta: ");
        Integer number = sc.nextInt();
        System.out.println("Insira o dono da conta: ");
        String holder = sc.next();
        System.out.println("Initial balabce: ");
        Double balance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        System.out.println("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();
        account = new Account(number, holder, balance, withdrawLimit);

        try {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Programa finalizado!");
        }
    }
}
