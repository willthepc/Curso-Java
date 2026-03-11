import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;
    private Double subTotal;
    private List<Product> lista = new ArrayList<>();

    public Product() {

    }

    public Product (String name, Double price, Integer quantity, Double subTotal) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void addLista(Product product) {
        lista.add(product);
    }

}
