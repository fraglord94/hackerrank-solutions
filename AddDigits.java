package hackerrank.algorithms;

public class AddDigits {
    public int addDigits(int num) {
        if(num == 0)
            return num;
        int sum = 0;
        while (sum > 9 || num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
