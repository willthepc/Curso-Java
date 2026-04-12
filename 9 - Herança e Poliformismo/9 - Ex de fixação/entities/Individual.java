public class Individual extends TaxPayer {
    private double healthExpenditures;

    public Individual(String name, Double anuallncome, double healthExpeditures) {
        super(name, anuallncome);
        this.healthExpenditures = healthExpeditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public Double tax() {
        if (getHealthExpenditures() != 0 && getAnuallncome() < 20000) {
            return (getAnuallncome() * (15.0 / 100)) - getHealthExpenditures() * (50.0/100);
        } else if (getHealthExpenditures() != 0 && getAnuallncome() > 20000) {
            return (getAnuallncome() * (25.0 / 100)) - getHealthExpenditures() * (50.0/100);
        } else {
            if (getAnuallncome() < 20000) {
                return getAnuallncome() * (15.0 / 100);
            } else {
                return getAnuallncome() * (25.0 / 100);
            }
        }
    }
}
