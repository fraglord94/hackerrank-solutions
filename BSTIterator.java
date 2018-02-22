package hackerrank.algorithms;

import java.util.Stack;

public class BSTIterator {
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode node = root;
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public boolean hasNext() {
        return stack.isEmpty();
    }

    public int next() {
        TreeNode ans = stack.pop();
        TreeNode current = ans;
        if (current.right != null) {
            current = current.right;
            while (current != null) {
                stack.push(current);
                current = current.right;
            }
        }
        return ans.val;
    }
}

