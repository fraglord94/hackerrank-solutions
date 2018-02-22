package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BeautifulArrangement {
    int count = 0;

    public int countArrangement(int N) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        permute(list, 0, N);
        return count;
    }

    private void permute(List<Integer> list, int k, int N) {
        if (k == N)
            count++;
        for (int i = k; i < N; i++) {
            Collections.swap(list, i, k);
            if (list.get(k) % k + 1 == 0 || k + 1 % list.get(k) == 0)
                permute(list, k + 1, N);
            Collections.swap(list, k, i);
        }
    }
}

