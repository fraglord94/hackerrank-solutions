/**
 * Created by Aronee Dasgupta on 9/9/2017.
 */
public class maximumSwap {

    public int maximumSwap(int num) {
        String d = Integer.toString(num);
        int []a = new int[d.length()];
        for (int i = 0; i < d.length(); i++) {
            a[i] = d.charAt(i) - '0';
        }
        int min = a[0];
        int minIndex = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] < a[i+1]){
                min = a[i];
                minIndex = i;
                break;
            }
            else if(i == a.length - 2)
                return num;
        }

        int max = min;
        int maxIndex = -1;
        for(int i = minIndex; i < a.length; i++){
            if(a[i] >= max){
                max = a[i];
                maxIndex = i;
            }
        }

        int swapIndex = -1;
        for(int i = 0; i <= minIndex; i++){
            if(a[i] < max){
                swapIndex = i;
                break;
            }
        }
        int temp = a[swapIndex];
        a[swapIndex] = a[maxIndex];
        a[maxIndex] = temp;

        for(int x : a)
            System.out.println(x);

        return  1;
    }

    public static void main(String[] args) {
        maximumSwap m = new maximumSwap();
        m.maximumSwap(437421);
    }
}
