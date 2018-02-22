package hackerrank.algorithms;

public class MaxPathSum {
    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        find(root);
        return ans;
    }

    int find(TreeNode node) {
        if (node == null)
            return 0;
        int left = find(node.left);
        int right = find(node.right);
        int single = Math.max(Math.max(left, right) + node.val, node.val);
        int both = Math.max(single, left + right + node.val);
        ans = Math.max(ans, both);
        return single;
    }
}
