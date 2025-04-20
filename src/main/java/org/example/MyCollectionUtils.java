package org.example;

import org.apache.commons.collections4.Predicate;

import java.util.Iterator;

public class MyCollectionUtils {
    public static <T> boolean filter(final Iterable<T> collection, final Predicate<? super T> predicate) {
        boolean result = false;
        if (collection != null && predicate != null) {
            for (final Iterator<T> it = collection.iterator(); it.hasNext();) {
                var item = it.next();

//                if (item == null) {
//                    continue;
//                }

                if (!predicate.evaluate(item)) {
                    it.remove();
                    result = true;
                }
            }
        }
        return result;
    }
}
