package behavioral.visitor.concrete;

import behavioral.visitor.ShoppingCartItem;
import behavioral.visitor.ShoppingCartItemVisitor;
import lombok.Getter;

public class Book implements ShoppingCartItem {

    @Getter
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public void accept(ShoppingCartItemVisitor visitor) {
        visitor.visit(this);
    }
}
