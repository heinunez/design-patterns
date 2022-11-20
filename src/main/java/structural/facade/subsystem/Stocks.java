package structural.facade.subsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stocks {
    public void checkAvailability(String productId, int quantity) {
        log.info("checking availability for {} {}", quantity, productId);
    }

    public void adjustStock(String productId, int quantity) {
        log.info("adjusting -{} {}", quantity, productId);
    }
}
