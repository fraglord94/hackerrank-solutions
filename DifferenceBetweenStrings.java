/*
 * 
 * 
 * 
 */
package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DifferenceBetweenStrings {

    public static void main(String[] args) {
        List<String> al1 = new ArrayList<>();
        al1.add("cat");
        al1.add("asd");
        al1.add("awer");
        al1.add("wed");
        al1.add("fri");
        al1.add("wrq");
        al1.add("vam");
        al1.add("asd");
        al1.add("asd");

        List<String> al2 = new ArrayList<>();

        al2.add("cat");
        al2.add("asd");
        al2.add("awer");
        al2.add("er");
        al2.add("rtg");
        al2.add("bbf");
        al2.add("wwe");
        al2.add("aaaaa");

        Set<String> set = new HashSet<>();
        Iterator<String> iter = al1.iterator();
        while (iter.hasNext()) {
            set.add(iter.next());
        }
        Iterator<String> iteral2 = al2.iterator();
        while (iteral2.hasNext()) {
            set.remove(iteral2.next());
        }

        for (String string : set) {
            System.out.print(string + " ");
        }

        String s = "ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmw"
                + "moswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwq"
                + "kpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbg"
                + "cysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohu"
                + "inkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjc"
                + "pgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbj"
                + "szolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrf"
                + "dxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvy"
                + "jxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmht"
                + "nxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszj"
                + "ywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxkn"
                + "nxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfv"
                + "jlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjch"
                + "jbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoo"
                + "fvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlr"
                + "nkbklwkrvoaziznlpor";
        String xas = "1";
        System.out.println(s.contains(xas));

        String t = "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvl"
                + "jybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggpl"
                + "fohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfv"
                + "wtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgr"
                + "rfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpoj"
                + "nxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzi"
                + "sqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzj"
                + "myucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkri"
                + "srlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwj"
                + "hwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyb"
                + "oyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsa"
                + "fknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdg"
                + "gifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqt"
                + "akdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyx"
                + "hbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdh"
                + "lnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";

        // char x = findTheDifference(s, t);
        findTheDifference(s, t);
    }

    static void findTheDifference(String s, String t) {
        int[] hashtable = new int[26];
        for (int i = 0; i < t.length(); i++) {
            hashtable[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            hashtable[s.charAt(i) - 'a']--;
        }
        int index = 0;
        for (int i = 0; i < 26; i++) {
            if (hashtable[i] > 0) {
                index = i;
                break;
            }
        }
        System.out.println((char) (index + 'a'));
    }

}
