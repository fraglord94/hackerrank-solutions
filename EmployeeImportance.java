import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    List<Integer> subordinates;
}

public class EmployeeImportance {
    static int counter = 0;

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return counter;
    }

    void help(Map<Integer, Employee> map, int id) {
        if (!map.containsKey(id))
            return;
        Employee employee = map.get(id);
        counter += employee.importance;
        for (int x : employee.subordinates) {
            help(map, x);
        }
    }

}

