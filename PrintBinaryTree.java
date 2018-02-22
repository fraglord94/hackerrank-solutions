package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrintBinaryTree {
    public List<List<String>> printTree(TreeNode root) {
        int height = getHeight(root);
        List<List<String>> ans = new ArrayList<>();
        int rows = height;
        int column = (int) Math.pow(2, rows) - 1;
        for (int i = 0; i < rows; i++) {
            ans.add(new ArrayList<>());
        }
        dfs(ans, 0, column, root, 0, rows);
        return ans;
    }

    private int getHeight(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    private void dfs(List<List<String>> ans, int i, int j, TreeNode node, int currentRow, int totalRow) {
        if (node == null || currentRow == totalRow)
            return;
        int pos = (i + j) / 2;
        ans.get(currentRow).set(pos, "" + node.val);
        dfs(ans, i, pos - 1, node.left, currentRow + 1, totalRow);
        dfs(ans, pos + 1, j, node.right, currentRow + 1, totalRow);

    }
}
