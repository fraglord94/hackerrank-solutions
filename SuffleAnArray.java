import java.util.Random;

public class SuffleAnArray {
    int[] a;

    public SuffleAnArray(int[] nums) {
        a = nums;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] shuffle() {
        int[] b = a.clone();
        for (int i = 1; i < a.length; i++) {
            Random random = new Random();
            int j = random.nextInt(i);
            swap(b, i, j);
        }
        return b;
    }


    /**
     * Returns a random shuffling of the array.
     */
    public int[] reset() {
        return a;
    }
}
