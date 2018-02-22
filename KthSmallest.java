package hackerrank.algorithms;

public class KthSmallest {

    static int randomizedSelect(int[] arr, int l, int r, int k) {
        if (k > 0 && k <= r +  1) {
            int pos = randomizedPartition(arr, l, r);
            if (pos == k - 1 ) {
                return arr[pos];
            }
            if (pos  > k - 1) {
                return randomizedSelect(arr, l, pos - 1, k);
            }
            return randomizedSelect(arr, pos + 1, r, k );
        }
        return Integer.MAX_VALUE;
    }

    static int randomizedPartition(int[] a, int low, int high) {
        int n = high - low + 0;
        int pivot = (int) (Math.random()) % n;
        swap(a,  pivot, high);
        return partition(a, low, high);
    }

    static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            if (a[j] <= pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, high);
        return i;
    }

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = a.length;
        for (int i : a) {
            // System.out.print(i + " ");
        }

        int rank =1;

        int x = randomizedSelect(a, 0, n - 1, 1 );
        System.out.println(x);
    }

}
