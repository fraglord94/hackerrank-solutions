public class KSubsequence {
    public static int countSubarrays(int[] nums, int k) {
        int[] cache = new int[k];
        cache[0]++;
        int s = 0, counter = 0;
        for (int i = 0; i < nums.length; i++) {
            s = ((s + nums[i]) % k + k) % k;
            counter += cache[s];
            cache[s]++;
        }

        return counter;
    }

    public static void main(String[] args) {
        int []a = new int[]{1,2,3,4};
        int ans = countSubarrays(a,1);
        System.out.println(ans);
    }

}
