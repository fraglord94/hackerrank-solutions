
package hackerrank.algorithms;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;

public class MergeIntervals {

    public static void main(String[] args) {
        PriorityQueue<User> pq = new PriorityQueue<>(10, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.left <= o2.left) {
                    return -1;
                } else //if(o1.left > o2.left)
                {
                    return 1;
                }
            }
        });
        pq.add(new User(3, 8));
        pq.add(new User(1, 3));
        pq.add(new User(7, 9));
        pq.add(new User(0, 7));
        pq.add(new User(3, 5));
        pq.add(new User(2, 8));

        pq.add(new User(1, 7));
        pq.add(new User(4, 8));
        pq.add(new User(1, 4));
        //pq.add(new User(15, 18));

        Set<User> al = new HashSet<>();
        User x = pq.poll();
        while (!pq.isEmpty()) {
            User y = pq.poll();

            if (x.right >= y.left) {
                x.right = y.right;
            } else {
                al.add(x);
                x = y;
            }
        }
        al.add(x);
        Iterator<User> iter = al.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

class User {

    int left;
    int right;

    User(int left, int right) {
        super();
        this.left = left;
        this.right = right;

    }

    @Override
    public String toString() {
        return "User{" + "left=" + left + ", right=" + right + '}';
    }

}
