import java.util.ArrayList;
import java.util.List;

public class SortedName {
    static String[] sortedNames(String[] a) {

        class Name {
            private String name;
            private String number;

            Name(String name) {
                String[] temp = name.split("\\s");
                this.name = temp[0];
                this.number = temp[1];
            }

            @Override
            public String toString() {
                return name + " " + number;
            }
        }

        List<Name> names = new ArrayList<>();
        for (String x : a) {
            names.add(new Name(x));
        }
        String numbers =
                "I II III IV V VI VII VIII IX X";

        names.sort((o1, o2) -> {
            if (o1.name.compareToIgnoreCase(o2.name) != 0)
                return o1.name.compareTo(o2.name);
            else {
                int n1 = numbers.indexOf(o1.number);
                int n2 = numbers.indexOf(o2.number);
                return n1 - n2;
            }
        });
        String[] ans = new String[names.size()];
        int index = 0;
        for (Name x : names) {
            ans[index++] = x + "";

        }
        return ans;
    }

    public static void main(String[] args) {
        String[] names2 = {"Louis IX", "Louis VIII"};

        String[] ans = sortedNames(names2);
        for (String x : ans) {
            System.out.println(x);
        }
    }
}

