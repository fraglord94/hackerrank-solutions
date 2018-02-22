package hackerrank.algorithms;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class FindRightInterval {
    public int[] findRightInterval(Interval[] a) {
        TreeMap<Integer, Element> treeMap = new TreeMap<>(Comparator.comparingInt(o -> o));
        int index = 0;
        for (Interval interval : a) {
            treeMap.put(interval.start, new Element(interval.start, interval.end, index));
            index++;
        }
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            Interval current = a[i];
            System.out.println("current interval " + current.start + " " + current.end);
            Map.Entry<Integer, Element> next = treeMap.ceilingEntry(current.end);
            if (next != null ) {
                System.out.println("next " + treeMap.get(next).toString());
                ans[i] = next.getValue().index;
            } else
                ans[i] = -1;

        }
        return ans;
    }

    private class Element {
        private int start;
        private int end;
        private int index;

        private Element(int start, int end, int index) {
            this.start = start;
            this.end = end;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "start=" + start +
                    ", end=" + end +
                    ", index=" + index +
                    '}';
        }
    }
}

