package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class GeneralizedAbbreviation {
    public List<String> generateAbbreviations(String word) {
        List<String> ans = new ArrayList<>();
        find(word, "", 0, 0, ans);
        return ans;
    }

    void find(String word, String temp, int i, int count, List<String> ret){
        if(i == word.length()){
            if(count > 0){
                temp = temp + count;
            }
            ret.add(temp);
        }
        else{
            find(word, temp, i + 1, count + 1, ret);
            find(word, temp + (count > 0 ? count : "") + word.charAt(i), i+1, 0, ret);
        }

    }
}
