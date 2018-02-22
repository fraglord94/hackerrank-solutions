package hackerrank.algorithms;

import java.util.*;

class Building{
    int x;
    int y;
    boolean start;

    @Override
    public String toString() {
        return "Building{" +
                "x=" + x +
                ", y=" + y +
                ", start=" + start +
                '}';
    }
}

public class Skyline {
    public List<int[]> getSkyline(int[][] buildings) {
        int n = buildings.length;
        Building[] array = new Building[2 * n];
        int index = 0;
        for (int[] building : buildings) {
            array[index] = new Building();
            array[index].x = building[0];
            array[index].start = true;
            array[index].y = building[2];

            array[index + 1] = new Building();
            array[index + 1].x = building[1];
            array[index + 1].start = false;
            array[index + 1].y = building[2];

            index = index + 2;

        }

        Arrays.sort(array, (b1, b2) -> {
            if (b1.x != b2.x)
                return b1.x - b2.x;
            else {
                return (b1.start ? -b1.y : b1.y) + (b2.start ? b2.y : -b2.y);
            }
        });


        List<int[]> ans = new ArrayList<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(0);
        int prevHeight = 0;
        for (Building b : array) {
            if (b.start)
                maxHeap.add(b.y);
            if (!b.start)
                maxHeap.remove(b.y);
            int currentMax = maxHeap.peek();
            if (currentMax != prevHeight) {
                ans.add(new int[]{b.x, b.y});
                prevHeight = currentMax;
            }
        }
        return ans;
    }
}
