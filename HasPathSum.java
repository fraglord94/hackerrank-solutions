public class HasPathSum {
    boolean hasPathWithGivenSum(TreeNode t, int s) {
        if(t == null)
            return s == 0;
        else{
            boolean ans = false;
            int rem = s - t.val;
            if(rem == 0 && t.left == null && t.right == null)
                return true;
            if(t.left != null)
                ans = ans || hasPathWithGivenSum(t.left, rem);
            if(t.right != null)
                ans = ans || hasPathWithGivenSum(t.right, rem);
            return  ans;
        }
    }
}
