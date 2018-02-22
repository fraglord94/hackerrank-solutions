package hackerrank.algorithms;

public class ReachingPoints {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (tx == sx && ty == sy) {
                return true;
            }
            if (ty > tx)
                ty -= tx;
            else
                tx -= ty;
        }
        return false;
    }
}
