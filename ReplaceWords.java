import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        if (dict == null || dict.size() == 0) return sentence;

        String[] s = sentence.split("\\s+");
        Set<String> set = new HashSet<>();
        set.addAll(dict);
        StringBuilder sb = new StringBuilder();
        for (String word : s) {
            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                if (set.contains(prefix)) {
                    word = prefix;
                    break;
                }
            }
            sb.append(word + " ");
        }
        return sb.toString();

    }
}
