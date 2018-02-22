import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {
        int[][] a =
                {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
    }

    boolean sudoku2(char[][] a) {
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> column = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (a[i][j] != '.' && row.add(a[i][j]))
                    return false;
                if (a[j][i] != '.' && column.add(a[j][i]))
                    return false;

            }
        }
        return false;
    }
}
