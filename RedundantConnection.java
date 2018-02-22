package hackerrank.algorithms;

public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int[] set = new int[2001];
        for (int i = 0; i < 2001; i++) {
            set[i] = i;
        }
        for (int[] edge : edges) {
            int v1 = edge[0];
            int v2 = edge[1];
            int s1 = findSet(set, v1);
            int s2 = findSet(set, v2);
            if (s1 == s2)
                return edge;
            else
                set[s1] = s1;

        }
        return new int[2];
    }

    int findSet(int[] set, int vertex) {
        if (set[vertex] != vertex) {
            set[vertex] = findSet(set, set[vertex]);
        }
        return set[vertex];
    }
}
