package hackerrank.algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for(List<Integer>row : wall){
            int sum = 0;
            for(int i = 0; i < row.size(); i++){
                sum = sum + row.get(i);
                if(!map.containsKey(i))
                    map.put(i, 1);
                else
                    map.put(i, map.get(i) + 1);

            }
        }

        int ans = wall.size();
        for(int x : map.keySet()){
            ans = Math.min(ans, wall.size() - map.get(x));
        }
        return ans;

    }
}
