public class strStr {
    public static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length())
            return -1;
        if(needle.length() == 0)
            return 0;
        char[] n = needle.toCharArray();
        char []h = haystack.toCharArray();
        int needleHash = 0;
        for(int i = 0; i < n.length; i++)
            needleHash += Character.valueOf(n[i]).hashCode();
        int hash = 0;
        for(int i = 0; i < n.length; i++)
            hash += Character.valueOf(h[i]).hashCode();
        if(needleHash == hash)
            if(check(0, needle, haystack))
                return 0;
        for(int i = 1; i <= haystack.length() - needle.length(); i++){
            hash = hash - Character.valueOf(h[i-1]).hashCode();
            hash = hash + Character.valueOf(h[i + needle.length() - 1]).hashCode();
            if(hash == needleHash){
                if(check(i, needle, haystack))
                    return i;
            }

        }
        return -1;
    }

    private static boolean check(int index, String needle, String haystack){
        int i = index;
        int j = 0;
        while( j < needle.length()){
            if(needle.charAt(j) != haystack.charAt(index))
                return false;
            j++;
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issi"));
    }
}
