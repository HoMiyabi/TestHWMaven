package org.example;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testFilter() {
        var list = new ArrayList<String>();
        list.add("apple");
        list.add(null);
        list.add("banana");

        MyCollectionUtils.filter(list, str -> str != null && str.startsWith("a"));

        assertEquals(1, list.size());
        assertTrue(list.contains("apple"));
    }

    @Test
    public void testUnion() {
        Collection<String> coll1 = List.of("a", "b");
        Collection<String> coll2 = List.of("b", "c");
        Collection<String> union = CollectionUtils.union(coll1, coll2);

        assertEquals(3, union.size());
        assertTrue(union.contains("a"));
        assertTrue(union.contains("b"));
        assertTrue(union.contains("c"));
    }

    @Test
    public void testIntersection() {
        Collection<String> coll1 = List.of("a", "b");
        Collection<String> coll2 = List.of("b", "c");
        Collection<String> intersection = CollectionUtils.intersection(coll1, coll2);

        assertEquals(1, intersection.size());
        assertTrue(intersection.contains("b"));
    }
}
