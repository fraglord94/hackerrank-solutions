package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReorderArray {
    public String minNumber(int[] a) {
        List<Integer> al = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.sort(al, (o1, o2) -> {
            String x = String.valueOf(o1) + String.valueOf(o2);
            String y = String.valueOf(o2) + String.valueOf(o1);
            return x.compareTo(y);
        });
        StringBuilder ans = new StringBuilder();
        for (int x : al) {
            ans.append(x);
        }
        return ans.toString().replaceFirst("^0+(?!$)", "");
    }
}
