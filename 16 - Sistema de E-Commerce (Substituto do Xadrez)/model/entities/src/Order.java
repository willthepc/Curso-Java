package model.entities.src;

import model.enums.src.OrderStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;
    private Client client;
    public List<OrderItem> items = new ArrayList<>();

    public Order (Integer id, Date moment, OrderStatus status, Client client, List items) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Order() {
        this.status = OrderStatus.PENDING_PAYMENT;
    }

    public Integer getId() {
        return id;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removaItems(OrderItem item) {
        if (item.getQuantity() > 1) {
            item.setQuantityForLess(1);
        } else {
            items.remove(item);
        }
    }

    public Integer total() {
        return items.size();
    }

    public String toString() {
        return "ID: " + id + "\nClient: " + client + "\nItem: " + items;
    }

}
