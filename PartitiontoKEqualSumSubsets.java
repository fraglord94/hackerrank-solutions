package hackerrank.algorithms;

import java.util.Arrays;

public class PartitiontoKEqualSumSubsets {
    public boolean canPartitionKSubsets(int[] a, int k) {
        if (k == 1)
            return true;
        if (a.length > k)
            return false;
        int sum = Arrays.stream(a).sum();
        if (sum % k != 0)
            return false;
        boolean visited[] = new boolean[a.length];
        return dfs(a, visited, 0, k, 0, sum / k);
    }

    boolean dfs(int[] a, boolean[] visited, int start, int k, int sum, int target) {
        if (k == 1)
            return true;
        if (sum == target)
            return dfs(a, visited, 0, k - 1, 0, target);
        for (int i = start; i < a.length; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                if (dfs(a, visited, i + 1, k, sum + a[i], target))
                    return true;
                visited[i] = false;
            }
        }
        return false;
    }
}
