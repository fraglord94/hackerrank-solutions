import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class NestedInteger {
    public NestedInteger() {
    }

    public NestedInteger(int value) {
    }

    abstract public boolean isInteger();

    abstract public Integer getInteger();

    abstract public void setInteger(int value);

    abstract public void add(NestedInteger ni);

    abstract public List<NestedInteger> getList();
}


public class NestedIntegerII {
    private static int maxDepth = 0;

    static void helper(Map<Integer, Integer> map, int level, List<NestedInteger> nestedIntegerList) {
        if (nestedIntegerList.isEmpty())
            return;
        maxDepth = Math.max(maxDepth, level);
        for (NestedInteger nestedInteger : nestedIntegerList) {
            if (nestedInteger.isInteger()) {
                if (!map.containsKey(level)) {
                    map.put(level, nestedInteger.getInteger());
                    System.out.println("comes here ");

                } else {
                    map.put(level, nestedInteger.getInteger() + map.get(level));
                    System.out.println("comes here in else ");
                }
            } else {
                helper(map, level + 1, nestedInteger.getList());
            }

        }
    }

    public int depthSumInverse(List<NestedInteger> nestedList) {
        Map<Integer, Integer> map = new HashMap<>();
        helper(map, 1, nestedList);
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("The value is" + entry.getValue());
        }
        for (int i = 1; i <= maxDepth; i++) {
            if (map.containsKey(i))
                ans = ans + map.get(i) * (maxDepth - i + 1);
        }
        return ans;
    }
}
