public class MaximumDiamter {

    static int findMaxDiamter(Node root) {
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int ld = findMaxDiamter(root.left);
        int rd = findMaxDiamter(root.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(ld, rd));

    }

    static int height(Node node) {
        if (node == null)
            return 0;
        else {
            int l = height(node.left);
            int r = height(node.right);
            if (l > r)
                return l + 1;
            else
                return r + 1;
        }
    }

    class Node {
        int val;
        Node left;
        Node right;
    }

}
