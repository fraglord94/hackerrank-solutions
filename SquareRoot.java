package hackerrank.algorithms;

public class SquareRoot {
    public int mySqrt(int x) {
        int ans = 1;
        int i = 1;
        while (ans < x) {
            if (ans == x)
                return ans;
            i = i + 1;
            ans = i * i;
        }
        return ans - 1;
    }
}
