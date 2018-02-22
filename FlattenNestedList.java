package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface NestedInteger {

    public boolean isInteger();

    public Integer getInteger();

    public List<NestedInteger> getList();
}

public class FlattenNestedList implements Iterator<Integer> {

    private List<Integer> list;
    private Iterator<Integer> iterator;

    public FlattenNestedList(List<NestedInteger> nestedList) {
        list = new ArrayList<>();
        flatten(nestedList);
        iterator = list.iterator();
    }

    private void flatten(List<NestedInteger> nestedIntegers) {
        for (NestedInteger nestedInteger : nestedIntegers) {
            if (nestedInteger.isInteger()) {
                list.add(nestedInteger.getInteger());
            } else
                flatten(nestedInteger.getList());

        }
    }

    @Override
    public Integer next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
