package hackerrank.algorithms;

public class IncreasingSubsequence {
    public boolean increasingTriplet(int[] a) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            if (x <= firstMin)
                firstMin = x;
            else if (x <= secondMin)
                secondMin = x;
            else if (x > secondMin)
                return true;

        }
        return false;
    }
}