package hackerrank.algorithms;

import java.util.*;
import java.util.LinkedList;

public class ClosestLeaf {
    public int findClosestLeaf(TreeNode root, int k) {
        Map<TreeNode, Set<TreeNode>> map = new HashMap<>();
        dfs(root, null, map);

        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        for (Map.Entry<TreeNode, Set<TreeNode>> entry : map.entrySet()) {
            TreeNode node = entry.getKey();
            if (node != null && node.val == k) {
                queue.offer(node);
                visited.add(node);
            }
        }
        while (queue.size() != 0) {
            TreeNode current = queue.poll();
            if (map.get(current).size() <= 1)
                return current.val;
            for (TreeNode child : map.get(current)) {
                if (!visited.contains(child)) {
                    visited.add(child);
                    queue.offer(child);
                }
            }
        }
        return -1;
    }

    void dfs(TreeNode current, TreeNode parent, Map<TreeNode, Set<TreeNode>> map) {
        if (current != null) {
            if (!map.containsKey(parent))
                map.put(parent, new HashSet<>());
            if (!map.containsKey(current))
                map.put(current, new HashSet<>());
            map.get(parent).add(current);
            map.get(current).add(parent);
            dfs(current.left, current, map);
            dfs(current.right, current, map);
        }
    }
}
