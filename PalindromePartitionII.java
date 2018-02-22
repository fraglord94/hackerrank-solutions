package hackerrank.algorithms;

public class PalindromePartitionII {
    public int minCut(String s) {
        return find(s, 0, s.length());
    }


    private int find(String s, int i, int j) {
        if (i == j)
            return 0;
        if (isPalindrome(s))
            return 0;
        else {
            int min = Integer.MAX_VALUE;
            int count;
            for (int x = i; x < j; x++) {
                count = find(s, i, x) + 1 + find(s, x + 1, j);
                if (count < min)
                    min = count;
            }
            return min;
        }

    }

    boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        return s.equals(sb.toString());

    }
}
