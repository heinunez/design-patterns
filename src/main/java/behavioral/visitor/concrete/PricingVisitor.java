package behavioral.visitor.concrete;


import behavioral.visitor.ShoppingCartItemVisitor;
import lombok.Getter;

public class PricingVisitor implements ShoppingCartItemVisitor {

    @Getter
    private double totalPrice = 0;

    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
    }

    @Override
    public void visit(CD cd) {
        totalPrice += cd.getPrice();
    }
}
