package service;

import domain.Order;

public interface OrderObserver {
    void onOrderPlaced(Order order);
}
