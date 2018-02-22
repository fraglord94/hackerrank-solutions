package hackerrank.algorithms;

import java.util.*;

public class MinimumGeneticMutation {
    public int minMutation(String start, String end, String[] bank) {
        Set<String> set = new HashSet<>(Arrays.asList(bank));
        char[] gene = {'A', 'T', 'C', 'G'};
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(start);
        int count = 0;
        while (queue.size() != 0) {
            int size = queue.size();
            for (int x = 0; x < size; x++) {
                String current = queue.poll();
                if (current.equals(end))
                    return count;
                char[] array = current.toCharArray();
                for (int i = 0; i < current.length(); i++) {
                    char old = array[i];
                    for (int j = 0; j < 4; j++) {
                        array[i] = gene[j];
                        String check = new String(array);
                        if (!check.equals(current) && set.contains(check)) {
                            queue.offer(check);
                            set.remove(check);
                        }
                    }
                    array[i] = old;
                }
            }
            count++;
        }
        return -1;
    }
}
