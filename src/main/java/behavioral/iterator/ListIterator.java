package behavioral.iterator;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ListIterator<I> implements Iterator<I> {
    private final List<I> list;
    private int current;

    @Override
    public void first() {
        current = 0;
    }

    @Override
    public void next() {
        current++;
    }

    @Override
    public boolean isDone() {
        return current >= list.size();
    }

    @Override
    public I currentItem() {
        if (isDone())
            throw new IndexOutOfBoundsException();
        return list.get(current);
    }
}
