package service;

import domain.Order;

public class PaymentService implements OrderObserver {
    @Override
    public void onOrderPlaced(Order order) {
        System.out.println("PaymentService: Processing payment for Order "
                + order.getOrderId());
    }
}
