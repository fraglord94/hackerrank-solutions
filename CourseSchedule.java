package hackerrank.algorithms;

import java.util.*;

public class CourseSchedule {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] a : prerequisites) {
            int parent = a[1];
            List<Integer> kids = map.get(parent);
            if (kids == null)
                kids = new ArrayList<>();
            kids.add(a[0]);
            map.put(parent, kids);
        }
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        boolean ans = true;
        for (int i = 0; i < numCourses; i++) {
            ans = ans && dfs(map, visited, i, stack);
        }
        if (ans == true)
            return new int[0];
        int[] result = new int[stack.size()];
        int index = 0;
        while (0 != stack.size()) {
            result[index++] = stack.pop();
        }
        return result;
    }


    private boolean dfs(Map<Integer, List<Integer>> map, Set<Integer> visited, int node, Stack<Integer> stack) {
        if (visited.contains(node))
            return true;
        visited.add(node);
        List<Integer> kids = map.get(node);
        if (kids != null) {
            for (int kid : kids) {
                dfs(map, visited, kid, stack);
            }
        }
        System.out.println(node);
        stack.add(node);
        visited.remove(node);
        return false;
    }
}