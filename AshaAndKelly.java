package hackerrank.algorithms;

public class AshaAndKelly {
    static int problems(int a, int k, int p) {
        if (a >= k)
            return -1;
        int Asha = p;
        int Kelly = 0;
        int ans = 0;
        while (Asha <= Kelly) {
            Asha += a;
            Kelly += k;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = problems(4, 5, 1);
        System.out.println(x);
    }
}
