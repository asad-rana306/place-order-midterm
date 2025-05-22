package domain;

import java.util.List;
import java.util.UUID;

public class OrderFactory {
    public static Order createOrder(String customerId, List<OrderItem> items) {
        String generatedId = UUID.randomUUID().toString();
        return new Order(generatedId, customerId, items);
    }
}
