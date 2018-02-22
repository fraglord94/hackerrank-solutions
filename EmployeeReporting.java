import java.util.*;

public class EmployeeReporting {

    static List<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        map.put(1, new HashSet<>(Arrays.asList(2, 3, 4)));
        map.put(3, new HashSet<>(Arrays.asList(5, 6, 7)));
        map.put(5, new HashSet<>(Arrays.asList(8, 9, 10)));
        map.put(9, new HashSet<>(Arrays.asList(11,12,13)));
        find(map, 3);
        System.out.println(Arrays.toString(ans.toArray()));
    }

    private static void find(Map<Integer, Set<Integer>> map, int x) {
        Set<Integer> employees = map.get(x);
        if (employees == null)
            return;
        ans.addAll(employees);
        for (Integer employeeManager : employees) {
            ans.add(employeeManager);
            find(map, employeeManager);
        }
    }

}