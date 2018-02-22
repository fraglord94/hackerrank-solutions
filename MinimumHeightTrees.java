package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Set<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(i, new HashSet<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int[] a = edges[i];
            adj.get(a[0]).add(a[1]);
            adj.get(a[1]).add(a[0]);
        }
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (adj.get(i).size() == 1)
                leaves.add(i);
        }

        while (n > 2) {
            n = n - leaves.size();
            List<Integer> ans = new ArrayList<>();
            for (int leaf : leaves) {
                int inner = adj.get(leaf).iterator().next();
                adj.get(inner).remove(leaf);
                if (adj.get(inner).size() == 1)
                    ans.add(inner);
            }
            leaves = ans;
        }
        return  leaves;
    }
}
