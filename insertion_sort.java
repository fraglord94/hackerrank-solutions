package hackerrank.algorithms;

public class insertion_sort {

    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int i = 1; i < a.length; i++) {
            int pivot = a[i];
            int j = i - 1;
            while (j > -1 && a[j] > pivot) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = pivot;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
