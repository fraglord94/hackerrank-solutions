package hackerrank.algorithms;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
    Queue<Integer> minHeap;
    Queue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((o1, o2) -> -o1 + o2);
    }

    public void addNum(int num) {
        if (minHeap.size() == 0 && maxHeap.size() == 0)
            minHeap.add(num);
        else if (minHeap.size() > maxHeap.size()) {
            if (num > minHeap.peek()) {
                maxHeap.offer(minHeap.poll());
                minHeap.add(num);
            } else {
                maxHeap.add(num);
            }
        } else if (minHeap.size() < maxHeap.size()) {
            if (num < maxHeap.peek()) {
                minHeap.add(maxHeap.poll());
                maxHeap.offer(num);
            } else
                minHeap.add(num);
        } else {
            if (num < maxHeap.peek())
                maxHeap.add(num);
            else
                minHeap.add(num);
        }
    }

    public double findMedian() {
        if (minHeap.size() > maxHeap.size())
            return minHeap.peek();
        else if (minHeap.size() < maxHeap.size())
            return maxHeap.peek();
        else if (minHeap.size() == maxHeap.size()) {
            return (minHeap.peek() + maxHeap.peek()) / 2;
        }
        return -1;
    }
}
