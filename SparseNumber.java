package hackerrank.algorithms;

public class SparseNumber {
    public int nextSparseNum(int n) {
        String bit = Integer.toBinaryString(n);
        char[] m = bit.toCharArray();
        String x = String.valueOf(m);
        x = '0' + x;
        char[] a = x.toCharArray();
        boolean skip = false;
        int last = a.length-1;
        for (char c : a)
            System.out.print(c);
        System.out.println();
        for(int i = a.length-2; i >= 0; i--){
            if(a[i] == '1' && a[i+1] == '1' && a[i-1] != 0){
                a[i-1] = '1';
                for(int j = i; j <= last; j++)
                    a[j] = '0';
                last = i-1;
            }
        }
        for (char c : a)
            System.out.print(c);
        System.out.println(Integer.toBinaryString(268435456));
        return Integer.valueOf(String.valueOf(a), 2);
    }

    class Node<T>{
        private T data;
        private Node left, right;
        Node(T data){
            this.data = data;
        }
    }

}