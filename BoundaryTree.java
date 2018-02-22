package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTree {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null)
            return ans;
        ans.add(root.val);
        left(root.left);
        leaves(root.left);
        leaves(root.right);
        right(root.right);
        return ans;
    }

    private void left(TreeNode node) {
        if (node == null || node.left == null && node.right == null)
            return;
        ans.add(node.val);
        if (node.left == null)
            left(node.right);
        else
            left(node.left);
    }

    private void right(TreeNode node) {
        if (node == null || node.left == null && node.right == null)
            return;
        ans.add(node.val);
        if (node.right == null)
            right(node.left);
        else
            right(node.right);

    }

    private void leaves(TreeNode node) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            ans.add(node.val);
            return;
        }
        leaves(node.left);
        leaves(node.right);
    }
}
