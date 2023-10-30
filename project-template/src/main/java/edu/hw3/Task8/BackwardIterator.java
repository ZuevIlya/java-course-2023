package edu.hw3.Task8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BackwardIterator<T> implements Iterator<T> {
    private final Iterator<T> iterator;

    public BackwardIterator(Collection<T> collection) {
        List<T> list = new ArrayList<>(collection.stream().toList());
        Collections.reverse(list);
        this.iterator = list.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        return iterator.next();
    }
}

