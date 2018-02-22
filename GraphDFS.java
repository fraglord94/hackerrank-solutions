import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GraphDFS {
    private int V;
    private LinkedList[] adj;

    GraphDFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    public static void main(String args[]) {
        GraphDFS g = new GraphDFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.DFS(2);
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
        List<Integer> nodes = adj[v];
        Iterator<Integer> i = adj[v].listIterator();
        for (Integer node : nodes){
            if(!visited[node]){
                DFSUtil(node, visited);
            }
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
}