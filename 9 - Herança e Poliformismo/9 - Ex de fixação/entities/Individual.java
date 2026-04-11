package entities;

public class Individual extends TaxPayer {
    private double healthExpenditures;

    public Individual(String name, Double anuallncome, double healthExpeditures) {
        super(name, anuallncome);
        this.healthExpenditures = healthExpeditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double heatlhExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        return 1.0;
    }
}
