package ex2.entities;

public class Product {
    private String nameP;
    private Double priceP;

    public Product(String nameP, Double priceP) {
        this.nameP = nameP;
        this.priceP = priceP;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public Double getPriceP() {
        return priceP;
    }

    public void setPriceP(Double priceP) {
        this.priceP = priceP;
    }
}