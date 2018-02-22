package hackerrank.algorithms;

import java.util.Stack;

public class iterative_traversal {

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty()) {
            Node x = stack.peek();
            System.out.println(x.data + " ");
            stack.pop();
            if (x.right != null) {
                stack.push(x.right);
            }
            if (x.left != null) {
                stack.push(x.left);
            }
        }
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node x = stack.peek();
            
            if (x.right != null) {
                stack.push(x.right);
            }
            System.out.println(x.data + " ");
            stack.pop();
            if (x.left != null) {
                stack.push(x.left);
            }
        }
    }
}
