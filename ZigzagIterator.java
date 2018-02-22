package hackerrank.algorithms;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class ZigzagIterator {

    private Queue<Iterator<Integer>> iteratorQueue;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        iteratorQueue = new ArrayDeque<>();
        iteratorQueue.offer(v1.iterator());
        iteratorQueue.offer((v2.iterator()));
    }

    public int next() {
        Iterator<Integer> currentIterator = iteratorQueue.poll();
        int ans = currentIterator.next();
        if (currentIterator.hasNext())
            iteratorQueue.offer(currentIterator);
        return ans;
    }

    public boolean hasNext() {
        return iteratorQueue.size() != 0;
    }
}