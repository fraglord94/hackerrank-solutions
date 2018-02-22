/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aronee
 */
public class nQueens {
    public List<List<String>> solveNQueens(int n) {
        char[][] a = new char[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        dfs(a, 0, res);
        return res;
    }

    void dfs(char[][] a, int col, List<List<String>> res) {
        if (col == a[0].length) {
            res.add(construct(a));
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (isValid(a, i, col)) {
                a[i][col] = 'Q';
                dfs(a, col + 1, res);
                a[i][col] = '.';
            }
        }
    }

    boolean isValid(char[][] a, int x, int y) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < y; j++) {
                if (a[i][j] == 'Q' && ((i - x == y - j) || (x - i == y - j) || i == x))
                    return false;
            }

        }
        return true;
    }

    List<String> construct(char[][] a) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            res.add(new String(a[i]));
        }
        return res;
    }
}
