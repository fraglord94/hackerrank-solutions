package hackerrank.algorithms;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author aronee
 */
public class CounterGame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            BigInteger v = s.nextBigInteger();

            int c = 0;
            while (v.compareTo(BigInteger.ZERO) > 0) {
                v = v.and(v.subtract(BigInteger.ONE));
                c++;
            }
            System.out.println((c & 1) == 0 ? "Richard" : "Louisie");
        }

    }
}
