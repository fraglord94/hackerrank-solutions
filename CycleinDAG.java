//package hackerrank.algorithms;
//
//import java.util.*;
//
//public class CycleinDAG {
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//
//        List []graph = new ArrayList[numCourses];
//        for(int i = 0; i < prerequisites.length;i++){
//            graph[i] = new ArrayList<Integer>();
//        }
//        for(int i = 0; i < prerequisites.length; i++){
//            int pair
//        }
//
//        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//            for (int x : entry.getValue()) {
//                System.out.println(x);
//            }
//        }
//        Set<Integer> visited = new HashSet<>();
//        for (int node = 0; node < numCourses; node++) {
//            if (!findCycle(node, visited, map))
//                return false;
//        }
//        return true;
//    }
//
//    boolean findCycle(int node, Set<Integer> visited, Map<Integer, List<Integer>> map) {
//        if (visited.contains(node))
//            return false;
//        else
//            visited.add(node);
//
//        if (map.containsKey(node)) {
//            List<Integer> kids = new ArrayList<>();
//            for (Integer kid : kids) {
//                if (!findCycle(kid, visited, map))
//                    return false;
//            }
//        }
//
//        visited.remove(node);
//        return true;
//    }
//}