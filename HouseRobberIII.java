package hackerrank.algorithms;

public class HouseRobberIII {
    public int rob(TreeNode root) {
        int[] num = dfs(root);
        return Math.max(num[0], num[1]);
    }

    private int[] dfs(TreeNode node) {
        if (node == null)
            return new int[2];
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        int res[] = new int[2];
        //rob
        res[0] = node.val + left[1] + right[1];
        res[1] = Math.max(right[0], right[1]) + Math.max(left[0], left[1]);
        return res;

    }
}