package model.entities.src;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subTotal() {
        return quantity * price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantityForLess(Integer quantity) {
        this.quantity -= quantity;
    }

    public void setQuantityForMore(Integer quantity) {
        this.quantity += quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getProduct() {
        return "Produto -> " + product.getName() + "\n" +
                "Preço -> " + this.price + "\n";
    }

    public String getNameLista() {
        return product.getName();
    }
}
