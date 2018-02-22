package hackerrank.algorithms;

import java.util.*;

public class MyCalendar {
    private TreeMap<Integer, Integer> map;
    private TreeMap<Integer, Integer> count;


    public MyCalendar() {
        map = new TreeMap<>();
        count = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        if (map.size() == 0) {
            map.put(start, end);
            return true;
        }
        Integer previousStart = map.floorKey(start);
        if (previousStart != null) {


            Integer previousEnd = map.get(previousStart);
            if (previousEnd != null && previousEnd > start)
                return false;
        }
        Integer nextStart = map.ceilingKey(start);
        if (nextStart != null && nextStart < end)
            return false;

        map.put(start, end);
        return true;
    }


}