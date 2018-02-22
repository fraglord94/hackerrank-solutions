package hackerrank.algorithms;

public class rotate_matrix {

    public static void main(String[] args) {
        int image[][] = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};

        int mat[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int a[][] = {{1,2},{3,4}};

        //extra_Buffer(image);
        inPlace(a);
    }

    static void extra_Buffer(int a[][]) {
        int m = a.length;
        int n = a[0].length;
        int ans_cw[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans_cw[j][m - i - 1] = a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans_cw[i][j] + " ");
            }
            System.out.println();
        }

        int ans_acw[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans_acw[n - j - 1][i] = a[i][j];
            }

        }
        System.out.println("acw");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans_acw[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void inPlace(int a[][]) {
        int n = a.length;
     
        //transpose
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j]; 
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        
                
        for (int[] is : a) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
           //reverse
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][n - j - 1];
                a[i][n - j - 1] = temp;
            }
        }

        
        //90 right, reverse then transpose
        //90 left, transpose then reverse 
    }
}
