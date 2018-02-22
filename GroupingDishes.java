import java.util.*;

public class GroupingDishes {
    static String[][] groupingDishes(String[][] dishes) {
        Map<String, Set<String>> map = new HashMap<>();
        for (int i = 0; i < dishes.length; i++) {
            for (int j = 1; j < dishes[i].length; j++) {
                if (map.containsKey(dishes[i][j])) {
                    Set<String> value = map.get(dishes[i][j]);
                    value.add(dishes[i][0]);
                    map.put(dishes[i][j], value);
                } else {
                    Set<String> set = new TreeSet<>(Comparator.naturalOrder());
                    set.add(dishes[i][0]);
                    map.put(dishes[i][j],set);
                }
            }
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Set<String>> pair = (Map.Entry)it.next();
            if(pair.getValue().size() < 2)
                it.remove();
        }

        for(Map.Entry<String, Set<String>> entry : map.entrySet()){
            String ingredient = entry.getKey();
            Set<String> set = entry.getValue();
            System.out.println(ingredient);
            for(String x : set)
                System.out.println(x + " ");
            System.out.println();
        }



        return null;
    }

    public static void main(String[] args) {
        String [][] dishes =
                {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                        {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                        {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                        {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};
        groupingDishes(dishes);
    }

}
