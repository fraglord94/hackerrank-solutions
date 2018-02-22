package hackerrank.algorithms;

public class FindPermutation {
    public int[] findPermutation(String s) {
        int max = s.length() + 1;
        int[] a = new int[max];
        for (int i = 0; i < max; i++)
            a[i] = i;
        for (int low = 0; low < s.length(); low++) {
            char c = s.charAt(low);
            int high = low;
            if (c == 'D') {
                while (high < s.length() && s.charAt(high) == 'D') {
                    high++;
                }
                reverse(a, low, high);
            }
        }
        return a;
    }

    void reverse(int[] a, int low, int high) {
        while (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
    }
}
