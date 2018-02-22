
public class Klargest {

    static int[] A = new int[10];

    static int heapSize;

    static int parent(int i) {
        return (i) / 2;
    }

    static int left(int i) {
        return 2 * i + 1;
    }

    static int right(int i) {
        return 2 * i + 2;
    }

    static void maxHeapify(int A[], int i) {
        int largest = i;
        int left = left(i);
        int right = right(i);

        if (left <= heapSize && A[left] > A[largest]) {
            largest = left;
        }
        if (right <= heapSize && A[right] > A[largest]) {
            largest = right;
        }
        if (i != largest) {
            swap(largest, i);
            maxHeapify(A, largest);
        }

    }

    static void buildMax(int A[]) {
        heapSize = A.length - 1;
        System.out.println("heapsize is " + heapSize);
        for (int i = heapSize / 2; i >= 0; i--) {
            maxHeapify(A, i);
        }
    }

    static void swap(int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    static void heapSort(int A[]) {
        heapSize = A.length - 1;
        buildMax(A);
        for (int i = heapSize; i >= 0; i--) {
            swap(0, i);
            heapSize--;
            maxHeapify(A, 0);
        }
        heapSize = A.length - 1;
    }

    static int extractMax(int[] A) {
        if (heapSize < 1) {
            return -1;
        }
        int temp = A[0];
        A[0] = A[heapSize - 1];
        heapSize = heapSize - 1;
        maxHeapify(A, 0);
        return temp;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            A[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 10; i++) {
           System.out.print(A[i] + " ");
        }
        System.out.println();
        buildMax(A);
        for (int i = 0; i < 10; i++) {
         //   System.out.print(A[i] + " ");
        }
        int k = 2;
        while (k > 1) {
            extractMax(A);
            k--;
        }
        System.out.println(extractMax(A));
    }

}
