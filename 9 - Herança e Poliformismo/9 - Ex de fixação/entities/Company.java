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
        if (getNumberOfEmployees() > 10) {
            return getAnuallncome() * (14.0 / 100);
        } else {
            return getAnuallncome() * (16.0 / 100);
        }
    }
}
