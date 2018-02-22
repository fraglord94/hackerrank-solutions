package hackerrank.algorithms;

import java.util.*;

public class StockTicker {
    private Map<String, Integer> map;
    private Set<Map.Entry<String, Integer>> treeSet;
    private int k = 3;

    public StockTicker(int k) {
        map = new HashMap<>(k);
        treeSet = new TreeSet<>((o1, o2) -> {
            if (Objects.equals(o1.getValue(), o2.getValue()))
                return -o1.getKey().compareTo(o2.getKey());
            else
                return -o1.getValue() + o2.getValue();
        });
    }

    public void addOrUpdate(String stock, int price) {
        AbstractMap.SimpleEntry<String, Integer> stockEntry = new AbstractMap.SimpleEntry<>(stock, price);
        if (map.containsKey(stock)) {
            treeSet.remove(new AbstractMap.SimpleEntry<>(stock, map.get(stock)));
        }
        map.put(stock, price);
        treeSet.add(new AbstractMap.SimpleEntry<String, Integer>(stock, price));
    }

    public List<Map.Entry<String, Integer>> top() {
        List<Map.Entry<String, Integer>> ans = new ArrayList<>();

        Iterator<Map.Entry<String, Integer>> treesetIterator = treeSet.iterator();
        while (treesetIterator.hasNext() && k-- > 0) {
            ans.add(treesetIterator.next());
        }
        return ans;
    }
}