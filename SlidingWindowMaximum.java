package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] a, int k) {
        List<Integer> ans = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (list.size() != 0 && a[list.getLast()] < a[i])
                list.removeLast();
            list.offerLast(i);
        }
        for (int i = k; i < a.length; i++) {
            ans.add(a[list.removeFirst()]);
            while (list.size() != 0 && list.getFirst() < (i - k + 1))
                list.removeFirst();
            while (list.size() != 0 && a[list.getLast()] < a[i])
                list.removeLast();

        }
        ans.add(a[list.getFirst()]);
        int res[] = new int[ans.size()];
        int index = 0;
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;

    }
}
