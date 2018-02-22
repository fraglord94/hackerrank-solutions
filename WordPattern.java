import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] a = str.split("\\s+");
        if (a.length != pattern.length())
            return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                String x = map.get(c);
                if (!x.equals(a[i]))
                    return false;

            }
            else{
                map.put(c,a[i]);
            }
        }
        return true;
    }
}
