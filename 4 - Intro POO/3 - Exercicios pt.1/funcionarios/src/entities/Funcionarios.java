package entities;

public class Funcionarios {
    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary() {
        return GrossSalary - Tax;
    }

    public double IncreaseSalary(double percentage) {
        return ((GrossSalary * (percentage / 100)) + GrossSalary) - Tax;
    }

    public String toString() {
        return "Nome: " + name + "\nSalário : " + NetSalary();
    }
}
