package model.entities.src;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    public List<OrderItem> items = new ArrayList<>();

    public Estoque() {}

    public void addItem(OrderItem orderItem) {
        items.add(orderItem);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void removaItems(OrderItem item) {
        if (item.getQuantity() > 1) {
            item.setQuantityForLess(1);
        } else {
            items.remove(item);
        }
    }
}
