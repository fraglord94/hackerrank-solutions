package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LargestBST {
    public static String splitLoopedString(String[] strs) {
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            String rev = new StringBuilder(strs[i]).reverse().toString();
            if (strs[i].compareTo(rev) < 0) strs[i] = rev;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) sb.append(strs[i]);
        String mid = sb.toString(), result = mid + strs[n - 1];
        for (int i = 0; i < n; i++) {
            String str = strs[i], rev = new StringBuilder(str).reverse().toString();
            mid = mid.substring(str.length()) + strs[(i + n - 1) % n];
            for (int j = 0; j <= str.length(); j++) {
                String s1 = str.substring(j) + mid + str.substring(0, j),
                        s2 = rev.substring(j) + mid + rev.substring(0, j);
                if (s1.compareTo(s2) >= 0 && s1.compareTo(result) > 0) result = s1;
                else if (s2.compareTo(s1) >= 0 && s2.compareTo(result) > 0) result = s2;
            }
        }
        return result;
    }

    public int largestBSTSubtree(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left != null && root.right == null)
            return 1;
        List<Integer> al = new ArrayList<>();
        inorder(root, al);
        int max = Integer.MIN_VALUE;
        int dp[] = new int[al.size()];
        for (int i = 0; i < dp.length; i++)
            dp[i] = 1;
        for (int i = 1; i < al.size(); i++) {
            if (al.get(i) > al.get(i - 1)) {
                dp[i] = dp[i - 1] + 1;
            }

        }
        int ans = 1;
        for (int x : dp) {
            if (Math.abs((int) Math.pow(2, x) - x) == 1)
                ans = x;
        }
        return ans;

    }

    public void inorder(TreeNode node, List<Integer> al) {
        if (node == null)
            return;
        inorder(node.left, al);
        al.add(node.val);
        inorder(node.right, al);

    }
}
