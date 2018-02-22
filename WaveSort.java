//public class WaveSort {
//    int i = 0;
//
//    {
//        if (i > 0 && arr[i - 1] > arr[i])
//            swap(arr, i - 1, i);
//
//        if (i < n - 1 && arr[i] < arr[i + 1])
//            swap(arr, i, i + 1);
//    }
//
//    static void swap(int arr[], int a, int b) {
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//
//
//
//    static void sortInWave(int arr[], int n) {
//        // Traverse all even elements
//        for (int i = 0; i < n; i += 2) {
//            // If current even element is smaller
//            // than previous
//            if (i > 0 && arr[i - 1] > arr[i])
//                swap(arr, i - 1, i);
//
//            // If current even element is smaller
//            // than next
//            if (i < n - 1 && arr[i] < arr[i + 1])
//                swap(arr, i, i + 1);
//        }
//    }
//    i<arr.length;i+=2)
//
//    // Driver program to test above function
//    public static void main(String args[]) {
//        SortWave ob = new SortWave();
//        int arr[] = {10, 90, 49, 2, 1, 5, 23};
//        int n = arr.length;
//        ob.sortInWave(arr, n);
//        for (int i : arr)
//            System.out.print(i + " ");
//    }
//
//}
//
//    public static void main(String args[]) {
//        int arr[] = {10, 90, 49, 2, 1, 5, 23};
//
//        System.out.println("Original pattern ");
//        for (int x :
//                arr) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//        System.out.println("Sorted in wave ");
//        int n = arr.length;
//        sortInWave(arr, n);
//        for (int i : arr)
//            System.out.print(i + " ");
//    }
//}
