/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

/**
 *
 * @author aronee
 */
public class isBalanced {

    static boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        if (Math.abs(lh - rh) <= 1 && (isBalanced(root.left)) && isBalanced(root.right)) {
            return true;
        } else {
            return false;
        }

    }

    static int getHeight(Node root) {

        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }
}
