import java.util.HashSet;
import java.util.Set;

public class FindPath {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 1, 1, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 9, 0, 1, 1},
                {1, 1, 1, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}};
        HashSet<String> invalidSet = new HashSet<>();
        boolean flg = isPath(maze, 0, 0, invalidSet);
        if (flg) System.out.println("Yes");
        else System.out.println("No");

    }

    static boolean isPath(int[][] a, int i, int j, Set<String> invalid) {
        if (i < 0 || i == a.length || j < 0 || j == a[0].length) {
            invalid.add(i + " " + j);
            return false;
        }
        if (a[i][j] == 0) {
            invalid.add(i + " " + j);
            return false;
        }

        if (a[i][j] == 9)
            return true;
        if (a[i][j] == 1 && !invalid.contains(i + " " + j)) {
            invalid.add(i + " " + j);
            return isPath(a, i + 1, j, invalid)
                    || isPath(a, i - 1, j, invalid)
                    || isPath(a, i, j + 1, invalid)
                    || isPath(a, i, j - 1, invalid);
        }
        return false;

    }
}
