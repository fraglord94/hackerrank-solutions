package hackerrank.algorithms;

import java.util.HashSet;
import java.util.Set;

public class ArrayNesting {
    public int arrayNesting(int[] a) {
        int n = a.length;
        int max = 0;
        Set<String> visited = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(visited.contains(i+""))
                continue;
            int current = dfs(a, i,visited);
            max = Math.max(max, current);
        }
        return max;
    }
    private int dfs(int []a, int start, Set<String> visited){
        int i = start;
        int count = 0;
        while(i != start || count == 0){
            i = a[i];
            visited.add(i+"");
            count++;
        }
        return count;
    }
}
