package hackerrank.algorithms;

public class happy_number {

    static int sum_square(int n) {
        int ans = 0;
        while (n > 0) {
            ans += Math.pow(n % 10, 2);
            n /= 10;
        }
        return ans;
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sum_square(slow);
            fast = sum_square(sum_square(fast));
        } while (slow != fast);
        return (slow == 1);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(14));
    }

}
