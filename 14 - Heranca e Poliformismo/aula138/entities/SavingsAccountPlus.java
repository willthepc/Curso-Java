package aula138.entities;

public class SavingsAccountPlus extends SavingsAccount {

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
