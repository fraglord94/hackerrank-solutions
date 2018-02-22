package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NextGreaterElementII {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] a : edges) {
            adjList.get(a[1]).add(a[0]);
            adjList.get(a[0]).add(a[1]);
        }
        int count = 0;
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                count++;
                dfs(i, adjList, visited);
            }
        }
        return count;
    }

    void dfs(int node, List<List<Integer>> adjList, Set<Integer> visited) {
        visited.add(node);
        for (int i : adjList.get(node)) {
            if (!visited.contains(i)) {
                dfs(i, adjList, visited);
            }
        }
    }
}
