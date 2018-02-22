package hackerrank.algorithms;

public class AddOneRow {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode temp = new TreeNode(v);
            temp.left = root;
            return temp;
        }
        add(root, v, d, 1);
        return root;
    }

    void add(TreeNode node, int v, int d, int currentDepth) {
        if (node == null)
            return;

        if (d - 1 == currentDepth) {
            TreeNode leftTemp = node.left;
            node.left = new TreeNode(v);
            node.left.left = leftTemp;

            TreeNode rightTemp = node.right;
            node.right = new TreeNode(v);
            node.right.right = rightTemp;
        }
        add(node.left, v, d, currentDepth + 1);
        add(node.right, v, d, currentDepth + 1);

    }
}
