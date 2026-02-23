package edu.grinnell.csc207.generics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ArrayListTests {
    @Test
    public void emptyListTest() {
        ArrayList<Integer> l = new ArrayList<>();
        assertEquals(0, l.size());
    }

    @Test
    public void listAddSizeTest() {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        assertEquals(10, l.size());
    }

    @Test
    public void listRemoveSome() {
        ArrayList<String> l = new ArrayList<>();
        l.add("10"); // index 0
        l.add("20"); // index 1
        l.add("30"); // 2
        l.add("40"); // 3
        l.add("50"); // 4

        // tests from the
        assertEquals(5, l.size()); // should be 5 things
        assertEquals("20", l.remove(1)); // remove the second thing
        assertEquals(4, l.size()); // should be one less then 4- 3
        assertEquals("30", l.get(1)); // get the removed index value wich should be updated

    }

}
