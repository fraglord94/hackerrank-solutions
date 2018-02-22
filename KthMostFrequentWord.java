/**
 * Created by Aronee Dasgupta on 9/8/2017.
 */
public class KthMostFrequentWord {
    public int maximumSwap(int n) {
        String x = Integer.toString(n);
        char[] a = x.toCharArray();
        int minindex = 0;
        int pivotdigit = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] > a[i]) {
                minindex = i;
                pivotdigit = a[i];
                break;
            } else if (minindex == a.length - 2)
                return n;
        }
        int maxIndex = -1;
        int max = -1;
        for (int i = minindex; i < a.length; i++) {
            if (a[i] > pivotdigit) {
                maxIndex = i;
                max = a[i];
            }
        }
        return 1;
    }
}
