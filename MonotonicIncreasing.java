package hackerrank.algorithms;

public class MonotonicIncreasing {
    public int monotoneIncreasingDigits(int N) {
        String s = Integer.valueOf(N).toString();
        int[] a = new int[s.length()];
        int index = 0;
        for (char c : s.toCharArray()) {
            a[index++] = Integer.valueOf(c - '0');
        }
        int pivot;
        for (pivot = 1; pivot < a.length; pivot++) {
            if (a[pivot - 1] > a[pivot])
                break;
        }
        if (pivot == a.length)
            return N;
        pivot = pivot - 1;
        a[pivot] = a[pivot] - 1;
        for (int i = pivot + 1; i < a.length; i++)
            a[i] = 9;
        int ans = 0;
        for (int x : a)
            ans = ans * 10 + x;
        return ans;
    }
}
