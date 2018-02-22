package hackerrank.algorithms;

import java.util.*;

class VerticalOderTraversal {

    public List<List<Integer>> verticalOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue queue = (Queue) new LinkedList();
        Queue col = (Queue) new LinkedList();
        queue.offer(root);
        col.offer(0);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (queue.size() != 0) {
            TreeNode node = (TreeNode) queue.poll();
            int cl = (int) col.poll();
            if (!map.containsKey(cl)) {
                map.put(cl, new ArrayList<>());
            }
            map.get(cl).add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
                col.offer(cl - 1);
                min = Math.min(min, cl - 1);
            }
            if (node.right != null) {
                queue.offer(node.right);
                col.offer(cl + 1);
                max = Math.max(max, cl + 1);
            }
        }
        for (int i = min; i <= max; i++) {
            ans.add(map.get(i));
        }
        return ans;
    }
}
