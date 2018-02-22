package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtrees {
    List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        helper(new HashMap<>(), root);
        return ans;
    }

    public String helper(Map<String, Integer> map, TreeNode node) {
        if (node == null)
            return "#";
        String s = helper(map, node.left) + " " + node.val + " " + helper(map, node.right);
        if (map.getOrDefault(s,0) == 1)
            ans.add(node);
        map.put(s, map.getOrDefault(s, 0) + 1);
        return s;

    }
}
