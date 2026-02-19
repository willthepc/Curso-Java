package model.entities;
import model.exception.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double deposit(Double amount) {
        return this.balance + amount;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount) {
        if (amount > this.balance ) {
            throw new DomainException("Erro de saque: Sem saldo.");

        }
        else if (amount > this.withdrawLimit) {
            throw new DomainException("Erro de saque: O saque excede o limite.");
        }
        else {
            this.balance -= amount;
        }
    }

    public String toString() {
        return "New balance: " + this.balance;
    }
}
