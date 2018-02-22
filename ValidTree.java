package hackerrank.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidTree {
    public boolean validTree(int n, int[][] edges) {
        Map<Integer, Set<Integer>> adjList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjList.put(i, new HashSet<>());
        }
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            Set<Integer> aKids = adjList.get(a);
            aKids.add(b);
            adjList.put(a, aKids);

        }
        Set<Integer> visited = new HashSet<>();

        return false;
    }

    boolean dfs(Set<Integer> visited, int vertex, Map<Integer, Set<Integer>> adjList) {
        if (visited.contains(vertex))
            return true;
        visited.add(vertex);
        Set<Integer> kids = adjList.get(vertex);
        for (int kid : kids) {
            if (visited.contains(kid))
                return true;
            dfs(visited, kid, adjList);
        }
        return false;
    }
}
