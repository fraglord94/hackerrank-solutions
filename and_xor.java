package hackerrank.algorithms;

public class and_xor {

    public static void main(String[] args) {
        int n = 5;
        int i = n;
        int count = 0;
        while (i > 0) {
            if ((n & i) == 0) {
                count++;
            }
            i = i >> 1;

        }
        System.out.println(1L << count);
    }

}
