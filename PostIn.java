package hackerrank.algorithms;

import java.util.Arrays;

public class PostIn {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return find(inorder, postorder, 0, n - 1, 0, n - 1);
    }

    TreeNode find(int[] in, int[] post, int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd)
            return null;
        int root = post[postEnd];
        TreeNode rootNode = new TreeNode(root);
        int k = Arrays.binarySearch(in, root);

        rootNode.left = find(in, post, inStart, inStart + k - 1, postStart, postStart + k - 1 - inStart);
        rootNode.right = find(in, post, k + 1, inEnd, postEnd - inEnd + k, postEnd - 1);

        return rootNode;
    }
}
