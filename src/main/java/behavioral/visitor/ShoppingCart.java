package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<ShoppingCartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
    }

    public void accept(ShoppingCartItemVisitor visitor) {
        for (ShoppingCartItem item : items) {
            item.accept(visitor);
        }
    }
}
