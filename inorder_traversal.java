package hackerrank.algorithms;


class inorder_traversal {

    boolean checkBST(Node root) {
        if (root != null) {
            checkBST(root.left);
            System.out.println(root.data);
            checkBST(root.right);
        }
        return false;
    }
}
