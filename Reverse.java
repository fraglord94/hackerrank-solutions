
public class Reverse {

    private static int iterativeReverse(int n){
        int ans = 0;
        while(n > 0){
            ans = ans * 10 + n % 10;
            n = n / 10;
        }
        return ans;
    }

    private static int recursiveReverse(int n, int recursiveReverseAns){
        if(n == 0)
            return recursiveReverseAns;
        else{
            recursiveReverseAns = recursiveReverseAns * 10 + n % 10;
           return recursiveReverse(n/10, recursiveReverseAns);
        }
    }

    public static void main(String[] args) {
        System.out.println(iterativeReverse(123456));
        System.out.println(iterativeReverse(12300123));
        System.out.println(iterativeReverse(987654));

        System.out.println("");

        System.out.println(recursiveReverse(123456, 0));
        System.out.println(recursiveReverse(12300123, 0));
        System.out.println(recursiveReverse(987654,0));
    }
}
