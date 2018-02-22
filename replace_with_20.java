/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

/**
 *
 * @author aronee
 */
public class replace_with_20 {

    static String s = "sdfdsf htyjy rwerew ghjgmcnwthh fgbzsdvzfg";

    public static void main(String[] args) {
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            sb.append("%20");
            sb.append(words[i]);
        }
    }
}
