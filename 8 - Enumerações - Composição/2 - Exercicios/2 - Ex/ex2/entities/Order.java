package ex2.entities;

import ex2.entitiesenum.OrderStatus;
import java.util.List;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<Product> produtos;

    
    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
        this.produtos = new ArrayList<>();
    }

    public void addItem(Product produto) {
        produtos.add(produto);
    }

    public void removeItem(Product produto) {
        produtos.remove(produto);
    }

    public Product total(Product produto) {
        return produto;
    }
}
