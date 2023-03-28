package behavioral.visitor;

public interface ShoppingCartItem {
    void accept(ShoppingCartItemVisitor visitor);
}
