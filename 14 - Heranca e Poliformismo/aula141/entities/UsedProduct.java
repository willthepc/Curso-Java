package aula141.entities;
import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;


    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String priceTag() {
        return getName() + " (used) $ " + getPrice() + " (Manufacture Date: " + manufactureDate;
    }
}
