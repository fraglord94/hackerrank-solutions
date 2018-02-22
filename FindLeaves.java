package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindLeaves {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, root);
        return null;
    }

    int helper(List<List<Integer>> ans, TreeNode node) {
        if (node == null)
            return 0;
        int left = helper(ans, node.left);
        int right = helper(ans, node.right);
        int height = Math.max(left, right) + 1;
        if (height == 0)
            ans.add(new ArrayList<>());
        ans.get(height).add(node.val);
        return height;
    }
}
