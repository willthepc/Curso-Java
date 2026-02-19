package aula005.ex2.entities;

public class OrderItem {
    private Integer quantity;
    private Double priceI;
    private Product product;

    public OrderItem(Integer quantity, Double priceI, Product product) {
        this.quantity = quantity;
        this.priceI = priceI;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPriceI() {
        return priceI;
    }

    public void setPriceI(Double priceI) {
        this.priceI = priceI;
    }

    public String getProduct() {
        return product.getNameP() + " $" + product.getPriceP();
    }

    public Double subTotal() {
        return quantity * priceI;
    }
}
