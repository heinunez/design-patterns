package structural.facade.subsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Payments {
    public void takePayment(String orderNumber) {
        log.info("take payment for order {}", orderNumber);
    }
}
