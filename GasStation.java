package hackerrank.algorithms;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = 0;
        int total = 0;
        int sum = 0;
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            sum = sum + gas[i] - cost[i];
            if (sum < 0) {
                total = total + sum;
                sum = 0;
                res = i + 1;
                break;
            }
        }
        total = total + sum;
        return total < 0 ? -1 : res;
    }
}