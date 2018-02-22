public class FindIslands {
    public int numIslands(char[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == '1') {
                    count++;
                    dfs(i, j, a);
                }
            }
        }
        return count;
    }

    void dfs(int i, int j, char[][] a) {
        if (i < 0 || j < 0 || i == a.length || j == a[0].length || a[i][j] == '0')
            return;
        a[i][j] = 0;
        dfs(i + 1, j, a);
        dfs(i, j + 1, a);
        dfs(i - 1, j, a);
        dfs(i, j - 1, a);
    }
}
