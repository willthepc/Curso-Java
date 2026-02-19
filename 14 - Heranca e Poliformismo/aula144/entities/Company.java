package aula144.entities;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company(String name, Double anuallncome, int numberOfEmployees) {
        super(name, anuallncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (getAnuallncome() > 20000) {
            return 
        }
    }
}
