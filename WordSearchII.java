import java.util.ArrayList;
import java.util.List;

public class WordSearchII {
    static boolean visited[][];

    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            if (exist(board, word))
                if (!ans.contains(word))
                    ans.add(word);
        }
        return ans;
    }

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
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
        if (i < 0 || j < 0 || i > board.length - 1 || j > board[i].length - 1 || word.charAt(k) != board[i][j] || visited[i][j] == true)
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
