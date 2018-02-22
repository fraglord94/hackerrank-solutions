package hackerrank.algorithms;


import java.util.*;

public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] a : prerequisites) {
            int parent = a[1];
            int kid = a[0];
            List<Integer> kids = map.get(parent);
            kids.add(kid);
            map.put(parent, kids);
        }
        Set<Integer> beingVisited = new HashSet<>();
        Set<Integer> fullyExploted = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            int course = i;
            if (topSort(course, map, beingVisited, fullyExploted, stack))
                return new int[2];
        }
        int[] ans = new int[stack.size()];
        int index = 0;
        while (stack.size() != 0) {
            ans[index++] = stack.pop();
        }
        return ans;
    }

    boolean topSort(int node, Map<Integer, List<Integer>> map, Set<Integer> beingVisited, Set<Integer> fullyExplored, Stack<Integer> ans) {
        if (beingVisited.contains(node))
            return true;
        if (fullyExplored.contains(node))
            return false;
        beingVisited.add(node);
        List<Integer> kids = map.get(node);
        for (int kid : kids) {
            if (topSort(kid, map, beingVisited, fullyExplored, ans))
                return true;
        }
        beingVisited.remove(node);
        fullyExplored.add(node);
        ans.push(node);
        return false;
    }
}