package hackerrank.algorithms;

import java.util.ArrayDeque;
import java.util.Queue;

public class StringIterator {
    private Queue<Character> queue;

    public StringIterator(String s) {
        queue = new ArrayDeque<>();
        int start = 0;

        int n = s.length();
        while (start < n) {
            int end = start + 1;

            while (end < n && Character.isDigit(s.charAt(end)))
                end++;
            char c = s.charAt(start);
            int digit = Integer.parseInt(s.substring(start + 1, end));
            start = end;
            while (digit-- > 0)
                queue.offer(c);
        }
        System.out.println(queue);
    }

    public char next() {
        if (!hasNext())
            return ' ';
        return queue.poll();

    }

    public boolean hasNext() {
        return queue.size() != 0;
    }
}
