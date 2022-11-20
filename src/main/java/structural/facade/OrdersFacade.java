package structural.facade;

import lombok.val;
import structural.facade.subsystem.Orders;
import structural.facade.subsystem.Payments;
import structural.facade.subsystem.Stocks;

public class OrdersFacade {
    private final Orders ordersSubsystem = new Orders();
    private final Payments paymentsSubsystem = new Payments();
    private final Stocks stocksSubsystem = new Stocks();

    public String placeOrder(String productId, int quantity) {
        stocksSubsystem.checkAvailability(productId, quantity);
        val orderNumber = ordersSubsystem.createOrder(productId, quantity);
        paymentsSubsystem.takePayment(orderNumber);
        ordersSubsystem.confirmOrder(orderNumber);
        stocksSubsystem.adjustStock(productId, quantity);
        return orderNumber;
    }
}
