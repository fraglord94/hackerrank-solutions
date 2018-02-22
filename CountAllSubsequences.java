import java.util.List;

public class CountAllSubsequences {
    public List<List<Integer>> findSubsequences(int[] a) {
        Node[] temp = new Node[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i].count = 1;
            temp[i].start = i;
            temp[i].end = i;
        }

        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && temp[i].count < temp[j].count + 1)
                    temp[i].count = temp[i].count + 1;
            }
        }
        for (Node count : temp) {
            System.out.println(count.count + " " + count.start + " " + " " + count.end);
        }

        return null;
    }

    private static class Node {
        int start;
        int end;
        int count;
    }

}
