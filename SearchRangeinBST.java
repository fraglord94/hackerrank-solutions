package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SearchRangeinBST {
    List<Integer> result = new ArrayList<>();

    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        if (root == null)
            return new ArrayList<>();
        inOrder(root);
        List<Integer> ans = new ArrayList<>();
        for (int x : result) {
            if (x >= k1 && x <= k2)
                ans.add(x);
        }
        return ans;
    }

    private void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        result.add(node.val);
        inOrder(node.right);
    }
}
