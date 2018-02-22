package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> ans = new ArrayList<>();
        int i = 0;
        int n = intervals.size();
        while (i < n && intervals.get(i).end < newInterval.start) {
            ans.add(intervals.get(i++));
        }
        while (i < n && intervals.get(i).start < newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;

        }
        ans.add(newInterval);
        while (i < n) {
            ans.add(intervals.get(i++));
        }
        return ans;
    }
}
