package behavioral.iterator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListIteratorTest {

    @Test
    public void testListIterator() {
        List<String> strings = Arrays.asList("one", "two", "three");
        Iterator<String> iterator = new ListIterator<>(strings);

        iterator.first();

        assertEquals("one", iterator.currentItem());

        iterator.next();

        assertEquals("two", iterator.currentItem());

        iterator.next();
        iterator.next();

        assertTrue(iterator.isDone());
        assertThrows(IndexOutOfBoundsException.class, iterator::currentItem);
    }

}