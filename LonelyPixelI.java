import java.util.HashSet;
import java.util.Set;

public class LonelyPixelI {
    public int findLonelyPixel(char[][] a) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> columnSet = new HashSet<>();
        int[] row = new int[a.length];
        int[] col = new int[a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 'B') {
                    row[i] += 1;
                    col[j] += 1;
                }

            }
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 'B' && row[i] == 1 && col[j] == 1)
                    count++;
            }
        }
        return count;
    }
}
