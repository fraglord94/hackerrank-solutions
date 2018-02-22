package hackerrank.algorithms;

public class IntegerReplacement {
    int ans = 0;

    int integerReplacement(int n) {
        if (n == 1)
            return 1;
        if (n == 3) {
            return 2;
        }
        if (n == Integer.MAX_VALUE)
            return 32;
        if (n % 2 == 0) {
            return 1 + integerReplacement(n / 2);
        } else {

            return 1 + Math.min(integerReplacement(n + 1), integerReplacement(n - 1));
        }

    }
}
