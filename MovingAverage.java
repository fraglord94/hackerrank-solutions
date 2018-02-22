package hackerrank.algorithms;

import java.util.ArrayDeque;
import java.util.Queue;

public class MovingAverage {
    Queue<Integer> queue;
    int maxSize;
    int sum = 0;

    public MovingAverage(int size) {
        this.queue = new ArrayDeque<>(size);
        this.maxSize = size;
    }

    public double next(int val) {
        if (queue.size() == maxSize) {
            sum = sum - queue.poll();
        }
        sum = sum + val;
        queue.offer(sum);
        return (double) sum / queue.size();

    }
}
