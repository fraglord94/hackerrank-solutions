package hackerrank.algorithms;

public class heap_implementation {

    static int heapSize = 0;

    static void maxHeapify(int[] A, int i, int heapSize) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heapSize && A[l] > A[i]) {
            largest = l;
        }
        if (r < heapSize && A[r] > A[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A, largest, heapSize);
        }

    }

    static int left(int i) {
        return 2 * i + 1;
    }

    static int right(int i) {
        return 2 * i + 2;
    }

    static int parent(int i) {
        return (int) Math.floor(i / 2);
    }

    static void buildMaxHeap(int[] A) {
        heapSize = A.length;
        for (int i = heapSize / 2; i >= 0; i--) {
            maxHeapify(A, i, heapSize);
        }
    }

    static void heapSort(int[] A) {
        heapSize = A.length - 1;
        buildMaxHeap(A);
        for (int i = A.length - 1; i >= 1; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            maxHeapify(A, 0, heapSize--);
        }
    }

    static int heapMaximum(int[] A) {
        return A[0];
    }

    static int extractMax(int[] A) {
        if (heapSize < 1) {
            return -1;
        }
        int max = A[0];
        A[0] = A[heapSize - 1];
        heapSize--;
        maxHeapify(A, 0, heapSize);
        return max;
    }

    public static void main(String[] args) {
        int[] array = new int[]{16, 4, 10, 14, 7, 9, 3, 2, 8, 1};

        /*heapSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }*/
        buildMaxHeap(array);
        for (int i = 0; i < heapSize; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
