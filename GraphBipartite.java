package hackerrank.algorithms;

import java.util.Arrays;

public class GraphBipartite {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        Arrays.fill(colors, -1);
        for (int i = 0; i < n; i++) {
            if (colors[i] == -1 && !dfs(graph, colors, i, 0))
                return false;
        }
        return true;
    }

    boolean dfs(int[][] graph, int[] colors, int vertex, int color) {
        if (colors[vertex] != -1)
            return colors[vertex] == color ;
        colors[vertex] = color;
        for (int kids : graph[vertex]) {
            if (!dfs(graph, colors, kids, 1 - color))
                return false;
        }
        return true;

    }
}
