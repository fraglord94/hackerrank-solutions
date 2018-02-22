/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

/**
 *
 * @author aronee
 */
public class max_k_bits_flip {

    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
        int m = 2;
        zero_flip(arr, arr.length, m);
    }

    static void zero_flip(int[] arr, int n, int m) {
        int wL = 0;
        int wR = 0;
        int bestLength = 0;
        int zeroCount = 0;
        int bestLeft = 0;
        while (wR < n) {
            if (zeroCount <= m) {
                if (arr[wR] == 0) {
                    zeroCount++;
                }
                wR++;
            }
            if (zeroCount > m) {
                if (arr[wL] == 0) {
                    zeroCount--;
                }
                wL++;
            }
            if (wR - wL > bestLength) {
                bestLength = wR - wL;
                bestLeft = wL;
            }

        }
        for (int i = 0; i < bestLength; i++) {
            if (arr[bestLeft + i] == 0) {
                System.out.println(bestLeft + i);
            }

        }
    }
}
