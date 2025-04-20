package org.example;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testFilter();
        testUnion();
        testIntersection();
    }

    public static void testFilter() {
        var list = new ArrayList<String>();
        list.add("apple");
        list.add(null);
        list.add("banana");

        MyCollectionUtils.filter(list, str -> str != null && str.startsWith("a"));

        if (list.size() == 1 && list.contains("apple")) {
            System.out.println("filter test passed");
        } else {
            System.out.println("filter test failed");
        }
    }

    public static void testUnion() {
        Collection<String> coll1 = List.of("a", "b");
        Collection<String> coll2 = List.of("b", "c");
        Collection<String> union = CollectionUtils.union(coll1, coll2);

        if (union.size() == 3 && union.contains("a") && union.contains("b") && union.contains("c")) {
            System.out.println("union test passed");
        } else {
            System.out.println("union test failed");
        }
    }

    public static void testIntersection() {
        Collection<String> coll1 = List.of("a", "b");
        Collection<String> coll2 = List.of("b", "c");
        Collection<String> intersection = CollectionUtils.intersection(coll1, coll2);

        if (intersection.size() == 1 && intersection.contains("b")) {
            System.out.println("intersection test passed");
        } else {
            System.out.println("intersection test failed");
        }
    }
}