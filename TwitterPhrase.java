public class TwitterPhrase {
    public static int maxLength(String s, int k) {
        String[] ans = s.split(" ");
        int[] a = new int[ans.length];
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = ans[i].length();
        }
        int start = 0;
        int end = 0;
        int sum = 0;
        int max = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
            end = end + 1;
            while (sum > k){
                sum = sum - a[i];
                start = start + 1;
            }
            max = Math.max(max, end - start );
        }

        return max;
    }

    public static void main(String[] args) {
        int x = maxLength("I am Bob", 3);
        System.out.println(x);
    }
}
