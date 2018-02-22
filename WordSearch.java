package hackerrank.algorithms;

public class WordSearch {
    static boolean visited[][];

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        if (word.length() > board[0].length || word.length() > board.length)
            return false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) == board[i][j] && find(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean find(char[][] board, String word, int i, int j, int k) {
        if (word.length() == k)
            return true;
        if (i < 0 || j < 0 || i > board[0].length || j > board[0].length || word.charAt(k) != board[i][j])
            return false;
        visited[i][j] = true;
        if (find(board, word, i + 1, j, k + 1) ||
                find(board, word, i, j + 1, k + 1) ||
                find(board, word, i - 1, j, k + 1) ||
                find(board, word, i, j - 1, k + 1))

            return true;
        visited[i][j] = false;
        return false;

    }
}
