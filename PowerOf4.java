package hackerrank.algorithms;

public class PowerOf4 {
    public boolean isPowerOfFour(int num) {
        if(num < 0)
            return false;
        if(num == Integer.MIN_VALUE)
            return false;
        char[] a = Integer.toBinaryString(num).toCharArray();
        if (a[0] == '1') {
            int count = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] != '0')
                    return false;
                count++;
            }
            return count % 2 == 0;
        }
        return false;
    }
}
