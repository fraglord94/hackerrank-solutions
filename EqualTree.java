package hackerrank.algorithms;

public class EqualTree {
    boolean ans = false;
    int total;

    public boolean checkEqualTree(TreeNode root) {
        if (root.left == null && root.right == null)
            return false;
        total = findSum(root);
        depth(root);
        return ans;
    }

    int findSum(TreeNode node) {
        if (node == null)
            return 0;
        return findSum(node.left) + node.val + findSum(node.right);
    }

    int depth(TreeNode node) {
        if (node == null)
            return 0;
        int current = depth(node.left) + node.val + depth(node.right);
        if (2 * current == total) {
            ans = true;
            return 0;
        }
        return current;
    }
}
