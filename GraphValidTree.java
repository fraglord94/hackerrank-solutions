package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adjList.add(i, new ArrayList<>());
        }
        for (int[] a : edges) {
            int parent = a[1];
            int kid = a[0];
            adjList.get(parent).add(kid);
            adjList.get(kid).add(parent);
        }
        Set<Integer> visited = new HashSet<>();
        if(dfs(visited, 0,-1, adjList))
            return false;
        for(int i = 0; i < n; i++){
            if(!visited.contains(i))
                return false;
        }
        return true;


    }

    boolean dfs(Set<Integer> visited, int vertex, int parent, List<List<Integer>> adj) {
        visited.add(vertex);
        for (int kids : adj.get(vertex)) {
            if (visited.contains(kids) && kids != parent ||
                    !visited.contains(kids) && dfs(visited, kids, vertex, adj))
                return true;
        }
        return false;
    }

}
