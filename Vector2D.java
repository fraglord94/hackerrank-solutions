package hackerrank.algorithms;

import java.util.Iterator;
import java.util.List;

public class Vector2D implements Iterator<Integer> {
     List<Integer> list;
    private int currentPointer;

    public Vector2D(List<List<Integer>> vec2d) {
        for (List<Integer> row : vec2d) {
            list.addAll(row);
        }
        this.currentPointer = 0;
    }

    @Override
    public Integer next() {
        if (this.hasNext()) {
            return list.get(currentPointer++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return currentPointer != list.size();
    }
}

