package structural.facade.subsystem;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
public class Orders {
    public void confirmOrder(String orderNumber) {
        log.info("order {} confirmed", orderNumber);
    }

    public String createOrder(String productId, int quantity) {
        log.info("creating order for {} {}", quantity, productId);
        return UUID.randomUUID().toString();
    }
}
