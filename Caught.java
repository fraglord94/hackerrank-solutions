package hackerrank.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Caught {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(s);
        }
    }

    static boolean canBeCaught(int x, int y, int[][] p, int[] r) {
        double slope = (double) y / (double) x;
        for (int i = 0; i < p.length; i++) {
            int[] a = p[i];
            int sx = a[0];
            int sy = a[1];
            int d = r[0];
            for (int dx = -d; dx <= d; ++dx) {
                for (int dy = -d; dy <= d; ++dy) {
                    int dest_x = sx + dx;
                    int dest_y = sy + dy;
                    if (dest_y == dest_x * slope)
                        return true;
                }
            }
            if (sy == sx * slope)
                return true;
        }
        return false;
    }

    static int[] getRecommendedTweets(int[][] followGraph_edges, int[][] likeGraph_edges,
                                      int targetUser, int minLikeThreshold) {
        List<Integer> ans;
        Set<Integer> follows = new HashSet<>();
        Map<Integer, List<Integer>> tweets = new HashMap<>();
        for (int i = followGraph_edges.length - 1; i >= 0; i--) {
            if (followGraph_edges[i][0] == targetUser) {
                follows.add(followGraph_edges[i][1]);
            }
        }
        IntStream.range(0, likeGraph_edges.length).forEachOrdered(i -> {
            if (tweets.containsKey(likeGraph_edges[i][1]) && follows.contains(likeGraph_edges[i][0])) {
                tweets.get(likeGraph_edges[i][1]).add(likeGraph_edges[i][0]);
            } else {
                if (follows.contains(likeGraph_edges[i][0])) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(likeGraph_edges[i][0]);
                    tweets.put(likeGraph_edges[i][1], temp);
                }
            }
        });
        ans = tweets.keySet()
                .stream()
                .mapToInt(k -> k)
                .filter(k -> tweets.get(k).size() >= minLikeThreshold)
                .boxed()
                .collect(Collectors.toList());
        int[] answer = ans.stream().mapToInt(an -> an).toArray();
        return answer;
    }

}