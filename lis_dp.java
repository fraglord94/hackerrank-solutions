package hackerrank.algorithms;

public class lis_dp {

    static int lis(int[] a, int n) {
        int lis[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (lis[i] > max) {
                max = lis[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        int[] arr = {29471, 5242, 21175, 28931, 2889, 7275, 19159, 21773, 1325, 6901};
        System.out.println(lis(arr, arr.length));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println(duration);

    }
}
