package hackerrank.algorithms;

public class CanReach {

    static String canReach(int x1, int y1, int x2, int y2) {
        boolean  ans = helper(x1,y1,x2,y2);
        return ans == true ? "YES" : "NO";
    }

    static  boolean helper(int x1, int y1, int x2, int y2){
        if(x1 > x2 || y1 > y2)
            return false;
        if(x1 == x2 &&  y1 == y2)
            return true;
        return helper(x1 + y1, y1,x2,y2) || helper(x1,y1 + x1, x2,y2);

    }

}
