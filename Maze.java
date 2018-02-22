package hackerrank.algorithms;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Maze {
    static boolean search(int x, int y, int[][] a, int[] d, Set<String> visited) {
        if (visited.contains(x + "" + y))
            return false;
        if (x == d[0] && y == d[1])
            return true;
        visited.add(x + "" + y);

        int right = x + 1;
        while (right < a.length && a[right][y] == 0)
            right++;
        if (search(right - 1, y, a, d, visited))
            return true;

        int left = x - 1;
        while (left >= 0 && a[left][y] == 0)
            left--;
        if (search(left, y, a, d, visited))
            return true;

        int up = y - 1;
        while (up >= 0 && a[x][up] == 0)
            up--;
        if (search(x, up + 1, a, d, visited))
            return true;

        int down = y + 1;
        while (down < a[0].length && a[x][down] == 0)
            down++;
        if (search(x, down - 1, a, d, visited))
            return true;
        return false;

    }

    public boolean hasPathx(int[][] a, int[] start, int[] destination) {
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new ArrayDeque<>();
        int m = a.length;
        int n = a[0].length;
        queue.offer(new int[]{start[0], start[1]});

        Set<String> set = new HashSet<>();
        set.add(start[0] + " " + start[1]);
        while (queue.size() != 0) {
            int[] current = queue.poll();

            if (current[0] == destination[0] && current[1] == destination[1])
                return true;
            for (int[] dir : dirs) {
                int x = current[0];
                int y = current[1];
                while (x >= 0 && x != m && y >= 0 && y != n && a[x][y] != 1) {
                    x = x + dir[0];
                    y = y + dir[1];
                }
                x = x - dir[0];
                y = y - dir[1];
                if (!set.contains(x + " " + y)) {
                    set.add(x + " " + y);
                    queue.offer(new int[]{x, y});
                }
            }
        }
        return false;
    }
}
