package hackerrank.algorithms;

import java.util.ArrayList;

public class MaxHeap {

    ArrayList<Integer> A;
    int heapSize = 0;

    MaxHeap() {
        A = new ArrayList<>(30);
        A.set(0, Integer.MIN_VALUE);
    }

    public int getSize() {
        return A.size() - 1;
    }

    private int left(int i) {
        return 2 * i;
    }

    private int right(int i) {
        return 2 * i + 1;
    }

    private int parent(int i) {
        return i / 2;
    }

    private void swap(int i, int j) {
        int tmp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, tmp);
    }

    void MaxHeapify(int i) {
        int largest = i;
        int left = this.left(i);
        int right = this.right(i);
        if (i < this.getSize() && A.get(largest) < A.get(left)) {
            largest = left;
        }
        if (i < this.getSize() && A.get(largest) < A.get(right)) {
            largest = right;
        }
        if (largest != i) {
            swap(i, largest);
            MaxHeapify(largest);
        }
    }

    void buildMaxHeap() {
        this.heapSize = this.getSize();
        for (int i = heapSize / 2; i >= 1; i--) {
            this.MaxHeapify(i);
        }
    }

    int HeapMaximum() {
        if (heapSize < 1) {
            return Integer.MIN_VALUE;
        }
        return A.get(1);
    }

    int extractMax() {
        if (heapSize < 1) {
            System.out.println("heap underflow");
            return Integer.MIN_VALUE;
        }
        int max = A.get(1);
        A.set(1, heapSize);
        A.remove(heapSize);
        heapSize--;
        this.MaxHeapify(1);
        return max;
    }

    void increasekey(int i, int key) {
        if (key < A.get(i)) {
            System.out.println("new key is smaller than the previous key");
        }
        A.set(i, key);
        while (i > 1 && A.get(this.parent(i)) < A.get(i)) {
            swap(i, parent(i));
            i = parent(i);
        }

    }

    void insertKey(int key) {
        heapSize++;
        A.add(Integer.MIN_VALUE); 
        increasekey(heapSize, key); 
    }

}
