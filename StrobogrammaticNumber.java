package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('6','9');
        map.put('9', '6');
        map.put('8', '8');
        map.put('1', '1');
        map.put('0','0');
        int l = 0;
        int r = s.length() -1;
        while(l <= r){
            if(!map.containsKey(s.charAt(l)))
                return false;
            if(map.get(s.charAt(l))!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
