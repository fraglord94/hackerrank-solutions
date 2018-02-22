//package hackerrank.algorithms;
//
//public class LongestUnivalueSequenceBT {
//    int max = 0;
//    public int longestConsecutive(TreeNode root) {
//
//    }
//    int [] find(TreeNode node){
//        if(node == null)
//            return new int[2];
//        int [] leftSt = find(node.left);
//        int []rightSt = find(node.right);
//        int asc = 1;
//        int dsc = 1;
//        if(node.left != null){
//            if(node.left.val == node.val - 1)
//                asc = asc + leftSt[0];
//            else if(node.left.val ==node.val + 1)
//                dsc = dsc + leftSt[1];
//        }
//        if(node.right != null){
//            if(node.right.val == node)
//        }
//    }
//
//}
