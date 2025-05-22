package service;

import domain.Order;
import domain.OrderFactory;
import domain.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<OrderObserver> observers = new ArrayList<>();

    public void registerObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public Order placeOrder(String customerId, List<OrderItem> items) {
        Order order = OrderFactory.createOrder(customerId, items);
        System.out.println("OrderService: Created Order " + order.getOrderId());

        for (OrderObserver obs : observers) {
            obs.onOrderPlaced(order);
        }
        return order;
    }
}
