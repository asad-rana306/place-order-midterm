package controller;

import domain.OrderItem;
import domain.Order;
import service.OrderService;
import service.InventoryService;
import service.PaymentService;

import java.util.List;

public class OrderController {
    private OrderService orderService;

    public OrderController() {
        this.orderService = new OrderService();
        orderService.registerObserver(new InventoryService());
        orderService.registerObserver(new PaymentService());
    }

    public Order placeOrder(String customerId, List<OrderItem> items) {
        return orderService.placeOrder(customerId, items);
    }
}
