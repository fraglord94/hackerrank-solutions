package hackerrank.algorithms;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class array_to_tree {

    static TreeNode sortedArrayToBST(int[] nums) {
        return arrayToTree(nums, 0, nums.length - 1);
    }

    static TreeNode arrayToTree(int[] nums, int i, int l) {
        if (i > l) {
            return null;
        }
        int mid = (i + l) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.right = arrayToTree(nums, mid + 1, l);
        treeNode.left = arrayToTree(nums, i, mid-1);
        return treeNode;


    }
}
