package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoomsII {
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals.length == 0 || intervals == null)
            return 0;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o.start));
        Queue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer((intervals[0].end));
        int count = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (minHeap.peek() > intervals[i].start) {
                count++;
            } else {
                minHeap.poll();
            }
            minHeap.offer(intervals[i].end);
        }
        return count++;
    }

    private class Interval {
        int start;
        int end;
    }
}
