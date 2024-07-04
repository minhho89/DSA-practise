package test.DataStructures.LinkedList;

import DataStructures.LinkedList.LinkedList;
import DataStructures.LinkedList.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListTest {
    @Test
    void testRemoveLast() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);

        Node removedNode = list.removeLast();
        assertEquals(2, list.getTail().getValue());
        assertEquals(3, removedNode.getValue());

        removedNode = list.removeLast();
        assertEquals(1, list.getTail().getValue());
        assertEquals(2, removedNode.getValue());

        removedNode = list.removeLast();
        assertNull(list.getTail());
        assertNull(removedNode);
    }
}
