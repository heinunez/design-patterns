package behavioral.visitor;

import behavioral.visitor.concrete.Book;
import behavioral.visitor.concrete.CD;

public interface ShoppingCartItemVisitor {
    void visit(Book book);

    void visit(CD cd);
}
