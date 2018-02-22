package hackerrank.algorithms;

public class check_ugly {

    static int max_divide(int n, int x) {
        while (n % x == 0) {
            n /= x;
        }
        return n;
    }

    static boolean isUgly(int n) {
        n = max_divide(n, 2);
        n = max_divide(n, 3);
        n = max_divide(n, 5);
        return (n == 1);
    }
    
    public static void main(String[] args) {
        System.out.println(isUgly(3001));
    }
}
