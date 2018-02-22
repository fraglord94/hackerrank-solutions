package hackerrank.algorithms;

import java.util.*;

public class InsertDeleteGetRandom {
    private Set<Integer> set;
    private Random random;

    public InsertDeleteGetRandom() {
        random = new Random();
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        List<Integer> temp = new ArrayList<>(set);
        int randomInt = random.nextInt(temp.size());
        return temp.get(randomInt);
    }
}
