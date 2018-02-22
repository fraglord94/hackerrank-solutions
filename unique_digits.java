package hackerrank.algorithms;

public class unique_digits {

    public static void main(String[] args) {
        System.out.println(isGood(1636789));
    }

    static boolean isGood(int n) {
        boolean flag = true;
        int k = 1;
        while (n > 0) {
            int r = n % 10;
            n /= 10;
            int x = n % 10;
            k = r ^ x;
            if (k == 0) {
                flag = false;
                break;
            }

        }
        return flag;
    }
}
