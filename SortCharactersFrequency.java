package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersFrequency {

    public static void main(String[] args) {

        String string = "aaaaaaaaaaaaaaaaaaaaaaaahgggggggggggggaaaaaaaaaaaaaaaaaaaaaaaaeeeeeeeegggggggggggcccccccssssssssggggg";
        HashMap<Character, Integer> map = new HashMap<>();
        int n = string.length();
        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        //    PriorityQueue<Element> pq = new PriorityQueue<>(map.size(), (Element e1, Element e2) -> -1 * e1.getCount().compareTo(e2.getCount()));
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character x = entry.getKey();
            Integer y = entry.getValue();

            Element element = new Element(x, y);
            pq.offer(element);

        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Element temp = pq.poll();
            Character ch = temp.getCh();
            Integer count = temp.getCount();
            while (count > 0) {
                sb = sb.append(ch);
                count--;
            }
        }
        System.out.println(sb);
    }
}

class Element implements Comparable<Element> {

    private Character ch;
    private Integer count;

    Element(Character ch, Integer count) {
        this.ch = ch;
        this.count = count;
    }

    public void setCh(Character ch) {
        this.ch = ch;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Character getCh() {
        return ch;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Element{" + "ch=" + ch + ", count=" + count + '}';
    }

    @Override
    public int compareTo(Element o) {
        return o.getCount() - this.getCount();
    }

}
