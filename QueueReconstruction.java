package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstruction {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
                    if (a[1] != b[1])
                        return a[0] - b[0];
                    else
                        return -a[1] + b[1];
                }
        );
        int n = people.length;
        int ans[][] = new int[n][2];

        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < n; i++)
            positions.add(i);

        for (int i = 0; i < n; i++) {
            int position = positions.get(people[i][1]);
            ans[position][0] = people[i][0];
            ans[position][1] = people[i][1];
            positions.remove(position);
        }

        return ans;



    }
}
