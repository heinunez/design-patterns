package behavioral.visitor;

import behavioral.visitor.concrete.Book;
import behavioral.visitor.concrete.CD;
import behavioral.visitor.concrete.PricingVisitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {

    @Test
    public void pricingVisitorTest() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CD(2));
        cart.addItem(new CD(2));
        cart.addItem(new Book(3));
        cart.addItem(new Book(3));

        PricingVisitor visitor = new PricingVisitor();
        cart.accept(visitor);

        assertEquals(10, visitor.getTotalPrice());
    }

}
