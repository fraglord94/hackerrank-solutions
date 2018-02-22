import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int hash = 0;
            for (int i = 0; i < s.length(); i++) {
                hash = hash + Character.valueOf(s.charAt(i)).hashCode();
            }
            if (map.containsKey(hash)) {
                List<String> list = map.get(hash);
                String x = list.get(0);
                char[] a = x.toCharArray();
                char[] b = s.toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                if (String.valueOf(a).equals(String.valueOf(b)) && !list.contains(s))
                    list.add(s);
                list.add(s);
                map.put(hash, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(hash, list);
            }
            Collections.sort(map.get(hash));

        }
        List<List<String>> ans = new ArrayList<>(map.values());
        return ans;


    }


    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = groupAnagrams(arr);
        for (List<String> x : ans) {
            for (String y : x) {
                System.out.println(y);
            }
            System.out.println();
        }
    }
}
