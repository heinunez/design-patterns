package behavioral.iterator;

public interface Iterator<I> {
    void first();

    void next();

    boolean isDone();

    I currentItem();
}
