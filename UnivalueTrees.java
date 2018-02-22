package hackerrank.algorithms;

public class UnivalueTrees {
    static int count;

    public int countUnivalSubtrees(TreeNode root) {
        count = 0;
        find(root);
        return count;
    }

    boolean find(TreeNode node) {
        if (node == null)
            return true;
        boolean left = find(node.left);
        boolean right = find(node.right);
        if (left && right
                &&
                (node.left == null || node.val == node.left.val)
                &&
                (node.right == null || node.val == node.right.val)) {
            count++;
            return true;
        }
        return true;
    }
}