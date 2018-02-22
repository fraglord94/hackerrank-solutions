package hackerrank.algorithms;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPoints {

    public Point[] kClosest(Point[] points, Point origin, int k) {

        Queue<Point> pq = new PriorityQueue<>((o1, o2) -> {
            double d1 = Math.pow((o1.x - origin.x), 2) + Math.pow((o1.y - origin.y), 2);
            double d2 = Math.pow((o2.x - origin.x), 2) + Math.pow((o2.y - origin.y), 2);
            if (d1 != d2)
                return (int) (d1 - d2);
            else if (d1 == d2 && o1.x != o2.x)
                return o1.x - o2.x;
            else
                return o1.y - o2.y;
        });
        Collections.addAll(pq, points);
        int index = 0;
        Point[] ans = new Point[k];
        while (k-- > 0) {
            ans[index] = pq.poll();
            index++;
        }
        return ans;
    }


    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
