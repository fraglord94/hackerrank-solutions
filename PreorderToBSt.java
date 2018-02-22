class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinaryTree {

    static int index = 0;

    // Driver program to test above functions
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int pre[] = new int[]{10, 5, 1, 7, 40, 50};
        int size = pre.length;
        Node root = tree.constructTree(pre, size);
        System.out.println("Inorder traversal of the constructed tree is ");
        tree.printInorder(root);
    }

    Node constructTreeUtil(int pre[],
                           int low, int high, int size) {

        // Base case
        if (index > size || low > high) {
            return null;
        }
        Node root = new Node(pre[index]);
        index ++;
        if (low == high) {
            return root;
        }
        int i;
        for (i = low; i <= high; ++i) {
            if (pre[i] > root.data) {
                break;
            }
        }

        root.left = constructTreeUtil(pre, index, i - 1, size);
        root.right = constructTreeUtil(pre, i, high, size);

        return root;
    }

    // The main function to construct BST from given preorder traversal.
    // This function mainly uses constructTreeUtil()
    Node constructTree(int pre[], int size) {
        return constructTreeUtil(pre, 0, size - 1, size);
    }

    // A utility function to print inorder traversal of a Binary Tree
    void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
}

// This code has been contributed by Mayank Jaiswal
