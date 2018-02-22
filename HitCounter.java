package hackerrank.algorithms;

import java.util.ArrayDeque;
import java.util.Queue;

public class HitCounter {
    private Queue<Integer> queue;

    public HitCounter() {
        queue = new ArrayDeque<>();
    }

    public void hit(int timestamp) {
        queue.offer(timestamp);
    }

    public int getHits(int timestamp) {
        while (queue.size() != 0 && queue.peek() - timestamp >= 300)
            queue.poll();
        return queue.size();
    }
}
