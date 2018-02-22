package hackerrank.algorithms;

public class GreaterTree {
    int current_sum = 0;

    public TreeNode convertBST(TreeNode root) {
        find(root);
        return root;
    }

    void find(TreeNode node) {
        if (node == null)
            return;
        find(node.right);
        current_sum += node.val;
        node.val = current_sum;
        find(node.left);
    }
}
