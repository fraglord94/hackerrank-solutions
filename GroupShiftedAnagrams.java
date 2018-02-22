import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupShiftedAnagrams{
    public List<List<String>> groupStrings(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            String key = new String();
            for(int i = 1; i < s.length(); i++) {
                key = key + (char) (((s.charAt(i) - s.charAt(i - 1)) + 26) % 26);
            }
            if(!map.containsKey(key)){
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(key, temp);
            }
            else{
                map.get(key).add(s);
            }
        }
        return new ArrayList<>(map.values());

    }
}