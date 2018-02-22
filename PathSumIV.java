package hackerrank.algorithms;

import java.util.Stack;

public class PathSumIV {
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> left = new Stack<>();
        Stack<TreeNode> right = new Stack<>();

        boolean leftdone = false;
        boolean rightdone = false;

        TreeNode currentLeft = root;
        TreeNode currentRight = root;

        int leftValue = 0;
        int rightValue = 0;


        while (true) {
            while (!leftdone) {
                if (currentLeft != null) {
                    left.push(currentLeft);
                    currentLeft = currentLeft.left;
                } else {
                    if (left.isEmpty()) {
                        leftdone = true;
                    } else {
                        currentLeft = left.pop();
                        leftValue = currentLeft.val;
                        currentLeft = currentLeft.right;
                        leftdone = false;
                    }
                }
            }
            while (!rightdone) {
                if (currentRight != null) {
                    right.push(currentRight);
                    currentRight = currentRight.right;
                } else {
                    if (right.isEmpty()) {
                        rightdone = true;
                    } else {
                        currentRight = right.pop();
                        rightValue = currentRight.val;
                        currentRight = currentRight.right;
                        rightdone = false;
                    }
                }
            }
            if (leftValue + rightValue == k)
                return true;
            else if (leftValue + rightValue < k)
                leftdone = false;
            else if (leftValue + rightValue > k)
                rightdone = true;
            if (leftValue >= rightValue)
                return false;
        }
    }
}
