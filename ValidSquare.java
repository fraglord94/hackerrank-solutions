package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Point[] points = new Point[]{new Point(p1[0], p1[1]),
                new Point(p2[0], p2[1]), new Point(p3[0], p3[1]), new Point(p4[0], p4[1])
        };
        List<Integer> distances = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (i == j)
                    continue;
                distances.add(distance(points[i], points[j]));
            }
        }
        Collections.sort(distances);
        for (int x : distances)
            if (x == 0)
                return false;

        return Objects.equals(distances.get(0), distances.get(1))
                && Objects.equals(distances.get(1), distances.get(2))
                && Objects.equals(distances.get(2), distances.get(3))
                && Objects.equals(distances.get(4), distances.get(5));

    }

    private int distance(Point p, Point q) {
        return (int) Math.pow((p.x - q.x), 2) + (int) Math.pow((p.y - q.y), 2);
    }

    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point)) return false;

            Point point = (Point) o;

            if (x != point.x) return false;
            return y == point.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }
}