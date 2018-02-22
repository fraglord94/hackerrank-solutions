package hackerrank.algorithms;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {

    private Integer next;
    private Iterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        next = iterator.next();
    }

    public Integer peek() {
        return next;
    }

    @Override
    public Integer next() {
        Integer result = next;
        if (iterator.hasNext()) {
            next = iterator.next();
        } else
            next = null;
        return result;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}