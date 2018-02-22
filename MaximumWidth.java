package hackerrank.algorithms;

public class MaximumWidth {
    public int widthOfBinaryTree(TreeNode root) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);

        return 1;

    }

    void helper(int hd, int min, int max, TreeNode node) {
        if (node == null)
            return;
        min = Math.min(hd, min);
        max = Math.max(hd, max);
        if (node.left != null)
            helper(hd - 1, min, max, node.left);
        if (node.right != null)
            helper(hd + 1, min, max, node.right);

    }
}
