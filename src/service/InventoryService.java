package service;

import domain.Order;

public class InventoryService implements OrderObserver {
    @Override
    public void onOrderPlaced(Order order) {
        System.out.println("InventoryService: Updating inventory for Order "
                + order.getOrderId());
    }
}
