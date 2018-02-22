package hackerrank.algorithms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PhoneDirectory {
    private int maxNumbers;
    private Set<Integer> used;
    private Queue<Integer> numbers;

    public PhoneDirectory(int maxNumbers) {
        this.used = new HashSet<>(maxNumbers);
        this.numbers = new LinkedList<>();
        this.maxNumbers = maxNumbers;
        for (int i = 0; i < maxNumbers; i++)
            numbers.offer(i);

    }

    public int get() {
        if (numbers.size() == 0)
            return -1;
        int n = numbers.poll();
        used.add(n);
        return n;
    }

    public boolean check(int number) {
        if (number < 0 || number > maxNumbers)
            return false;
        return !used.contains(number);
    }

    public void release(int number) {
        if (used.contains(number)) {
            used.remove(number);
            numbers.offer(number);
        }
    }
}

