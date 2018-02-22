public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        if (s.length() > t.length())
            isOneEditDistance(t, s);
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) != t.charAt(j)){
                return s.substring(i+1).equals(t.substring(j+1)) ||
                        s.substring(i).equals(t.substring(j+1));
            }
            i++;
            j++;
        }
        if(j == t.length() - 1)
            return true;
        return false;


    }
}
