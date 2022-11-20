package structural.facade;

import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrdersFacadeTest {

    @Test
    public void facadeTest() {
        val facade = new OrdersFacade();
        val orderNumber = facade.placeOrder("200012", 300);
        Assertions.assertNotNull(orderNumber);
    }
}
