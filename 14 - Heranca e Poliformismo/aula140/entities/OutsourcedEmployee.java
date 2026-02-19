package aula140.entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;
    
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public Double payment() {
        return (getHours() * getValuePerHour()) + additionalCharge * 1.1;
    }
}
