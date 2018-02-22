package hackerrank.algorithms;

import java.util.Random;

public class QuickSort {

    static void quicksort(int[] a, int low, int high) {
        if (low < high) {
            int pivot = partition(a, low, high);
            quicksort(a, low, pivot - 1);
            quicksort(a, pivot + 1, high);
        }

//        takes nlgn in the best case . the recursion will be given by Tn = 2Tn/2 + n 
//        takes n2 in the worst case and this will occur if the array is completety unsorted or all distinct elements and the 
//        recurrence will be Tn = Tn-1 + T1 + n. This is cannot be solved vy MT but u can solve it by reurrence. The inner loop can be optimized 
//        very well in some architectures. And this is inplace and unlike merge sort thi will not take 0n space. But merge srt is better for larger data files
//        Quick sort can be made tail recursive int the quick sort step. SO this reducesthe number of function stack space in th e
    }

    static int partition(int[] a, int low, int high) {
        int rnd = high;//low + new Random().nextInt(high - low);
        // System.out.println(rnd);
        int pivot = a[rnd];
        int i = low - 1;
        for (int j = low; j <= rnd - 1; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }
        int temp = a[i + 1];
        a[i + 1] = a[rnd];
        a[rnd] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int a[] = {10, 7, 8, 9, 1, 5};
        int n = a.length;
        for (int i : a) {
            System.out.print(i + " ");
        }
        quicksort(a, 0, n - 1);

        System.out.println("after sorting ");
        //System.out.println("");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
