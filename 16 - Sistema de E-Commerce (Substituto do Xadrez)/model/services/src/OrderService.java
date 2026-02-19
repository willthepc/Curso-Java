package model.services.src;

import model.entities.src.Order;
import model.enums.src.OrderStatus;
import model.exception.src.DomainException;

public class OrderService {
    public double processOrder(Order order) {

        order.setStatus(OrderStatus.PROCESSING);

        return order.total();
    }
}
