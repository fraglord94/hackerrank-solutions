import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class LexicographicalNumbers {
    public static void main(String[] args) {
        List<Integer> ans = lexicalOrder(12);
        for (int x :
                ans) {
            System.out.println(x);
        }
    }

    public static List<Integer> lexicalOrder(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a = String.valueOf(o1);
                String b = String.valueOf(o2);
                return a.compareTo(b);
            }
        });

        for (int i = 1; i < n; i++) {
            pq.offer(i);
        }
        List<Integer> ans = new ArrayList<>();
        while (pq.size() != 0) {
            ans.add((pq.poll()));
        }
        return ans;
    }
}
