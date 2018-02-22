package hackerrank.algorithms;

/**
 * Created by Aronee Dasgupta on 9/7/2017.
 */
public class MicrosoftPhoneScreen {
    public static void MakeTheNumbersMatch(int a, int b, int x, int y) {
        while (a != x && b != y) {
            if (a > x) {
                a--;
            } else {
                a++;
            }
            if (b > y) {
                b--;
            } else {
                b++;
            }
        }
    }

    public static void main(String[] args) {
        MakeTheNumbersMatch(1,2,12,12);
    }
}
