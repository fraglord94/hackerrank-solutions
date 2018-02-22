package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class UniqueBSTConstruct {
    public List<TreeNode> generateTrees(int n) {
        return find(1, n);
    }

    private List<TreeNode> find(int start, int end) {
        List<TreeNode> temp = new ArrayList<>();
        if (start > end) {
            temp.add(null);
            return temp;
        }

        if (start == end) {
            temp.add(new TreeNode(start));
            return temp;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftSubTree = find(start, i - 1);
            List<TreeNode> rightSubTree = find(i + 1, end);
            for (TreeNode leftNode : leftSubTree) {
                for (TreeNode rightNode : rightSubTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    temp.add(root);

                }
            }
        }
        return temp;

    }
}

