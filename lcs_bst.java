package hackerrank.algorithms;

class lca {

    static Node lca_bst(Node root, int v1, int v2) {
        if (root == null) {
            return null;
        }
        if (root.data > v1 && root.data > v2) {
            return lca(root.left, v1, v2);
        }
        if (root.data < v1 && root.data < v2) {
            return lca(root.right, v1, v2);
        }
        return root;

    }

    static Node lca(Node root, int v1, int v2) {
        if (root == null) {
            return null;
        }
        if (root.data == v1 || root.data == v2) {
            return root;
        }
        Node left = lca(root.left, v1, v2);
        Node right = lca(root.left, v1, v2);
        if (left != null && right != null) {
            return root;
        }
        return (left != null) ? left : right;
    }

}
