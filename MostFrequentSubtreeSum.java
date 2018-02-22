package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentSubtreeSum {
    Map<Integer, Integer> map;
    int ans;

    public int[] findFrequentTreeSum(TreeNode root) {
        map = new HashMap<>();
        ans = 0;
        helper(root);
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == ans)
                result.add(entry.getKey());
        }
        int a[] = new int[result.size()];
        int index = 0;
        for (int i : result) {
            a[index++] = i;
        }
        return a;
    }

    private int helper(TreeNode node) {
        if (node == null)
            return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        int sum = left + right + node.val;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        ans = Math.max(ans, map.get(sum));
        return sum;
    }
}
