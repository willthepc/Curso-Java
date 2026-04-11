package entities;

public class Conta {
    public int number;
    public String holder;
    public double balance;

    public Conta(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Conta(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public void deposit(Double balance) {
        this.balance += balance;
    }

    public void withdraw(Double balance) {
        this.balance -= balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account: " + getNumber() + ", Holder: " + getHolder() + ", Balance: $ " + getBalance();
    }

}
