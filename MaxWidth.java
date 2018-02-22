import java.util.ArrayDeque;
import java.util.Queue;

public class MaxWidth {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int max = 1;
        while(queue.size() != 0){
            int count = queue.size();
            max = Math.max(count, max);
            while(count > 0){
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
                count --;
            }
        }
        return max;
    }
}
