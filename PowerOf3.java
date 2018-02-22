package hackerrank.algorithms;

public class PowerOf3 {
    public boolean isPowerOfThree(int n) {
        double ans = Math.log10(n) / Math.log10(3);
        System.out.println(ans);
        return ans %  3 == 0;
    }
}
