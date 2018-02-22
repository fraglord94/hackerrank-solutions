import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] a, int k, int t) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            if(map.containsKey(a[i])){
                int index  = map.get(a[i]); 
            }
        }

        return false;

    }
}
