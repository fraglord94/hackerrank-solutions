import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestNumber {
    public String largestNumber(int[] a) {
        int[] nums = {3, 30, 34, 5, 9};
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        for (int num : nums) {
            pq.offer(String.valueOf(num));
        }
        StringBuilder sb = new StringBuilder();
        while(pq.size() != 0){
            sb.append(pq.remove());
        }
        return sb.toString();
    }
}
