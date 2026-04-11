package entities;

public class Conta {
    public Integer number;
    public String holder;
    public Double balance;

    public void deposit(Double balance) {
        this.balance += balance;
    }

    public void withdraw(Double balance) {
        this.balance -= balance;
    }

    public String toString() {
        return "Account: " + number + ", Holder: " + holder + ", Balance: $ " + balance;
    }

}
