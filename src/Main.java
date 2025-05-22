import controller.OrderController;
import domain.OrderItem;
import domain.Order;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderController controller = new OrderController();
        List<OrderItem> items = Arrays.asList(
                new OrderItem("P1", 2),
                new OrderItem("P2", 1)
        );

        Order order = controller.placeOrder("C789", items);
        System.out.println("Main: Order placed with ID " + order.getOrderId());
    }
}
