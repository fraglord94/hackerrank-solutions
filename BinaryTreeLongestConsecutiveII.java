package hackerrank.algorithms;

public class BinaryTreeLongestConsecutiveII {
    int ans = 0;

    public int longestConsecutive(TreeNode root) {
        find(root);
        return ans;
    }

    int[] find(TreeNode node) {
        if (node == null)
            return new int[2];
        int[] left = find(node.left);
        int[] right = find(node.right);
        int rightTurn = 1;
        int leftTurn = 1;
        if (node.left != null) {
            if (node.left.val + 1 == node.val)
                rightTurn = rightTurn + left[0];
            else if (node.left.val - 1 == node.val)
                leftTurn = leftTurn + left[1];
        }
        if (node.right != null) {
            if (node.val + 1 == node.right.val)
                rightTurn = Math.max(rightTurn, 1 + right[0]);
            if (node.val - 1 == node.right.val)
                leftTurn = Math.max(leftTurn, 1 + right[1]);
        }
        ans = Math.max(ans, leftTurn + rightTurn - 1);
        System.out.println(node.val + " " + leftTurn + " " + rightTurn);
        return new int[]{leftTurn, rightTurn};
    }
}
