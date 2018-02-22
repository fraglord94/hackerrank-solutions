package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BinarySearchTreeLCA {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        int x = -1;
        int y = -1;
        while ((line = in.readLine()) != null) {
            String[] nodes = line.split("\\s+");
            x = Integer.parseInt(nodes[0]);
            y = Integer.parseInt(nodes[1]);
        }

        Node root = constructBST();
        Node lca = findLCA(root, x, y);
        System.out.println(lca.data);

    }

    /**
     * Function to find the LCA of the two nodes.
     * @param node
     * @param x
     * @param y
     * @return The LCA of the two nodes. Returns null if LCA is not found.
     */
    private static Node findLCA(Node node, int x, int y) {
        if (node == null)
            return null;
        if (node.data > x && node.data > y)
            return findLCA(node.left, x, y);
        if (node.data < x && node.data < y)
            return findLCA(node.right, x, y);
        return node;
    }

    /**
     * Utilty function to create the BST.
     * @return: The root node of the BST.
     */
    private static Node constructBST() {
        Node root = new Node(30);
        root.left = new Node(8);
        root.right = new Node(52);
        root.left.left = new Node(3);
        root.left.right = new Node(20);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(29);
        return root;
    }

    /**
     * Class representing a single node in the Binary search tree.
     */
    private static class Node {
        private int data;
        private Node left;
        private Node right;

        private Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
