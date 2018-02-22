package hackerrank.algorithms;

public class BombEnemy {
    public int maxKilledEnemies(char[][] a) {

        if (a == null || a.length == 0 || a[0].length == 0) return 0;

        int m = a.length;
        int n = a[0].length;

        int dp[][] = new int[m][n];

        //l-r
        for(int i = 0; i < m; i++){
            int count = 0;
            for(int j = 0; j < n; j++ ){
                count = find(a, dp, i,j,count);
            }
        }
        //up-down
        for(int j = 0; j < n; j++){
            int count = 0;
            for(int i = 0; i < m; i++ ){
                count = find(a, dp, i,j,count);
            }
        }
        //right - left
        for(int i = 0; i < m; i++){
            int count = 0;
            for(int j = n-1; j >= 0; j-- ){
                count = find(a, dp, i,j,count);
            }
        }

        //down-up
        for(int j = 0; j < n; j++){
            int count = 0;
            for(int i = m - 1; i >= 0; i-- ){
                count = find(a, dp, i,j,count);
            }
        }

        int ans = 0;

        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j++){
                if(a[i][j] == '0')
                    ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;

    }

    private int find(char [][]a, int dp[][], int i , int j , int count){
        if(a[i][j] == 'W')
            count = 0;
        if(a[i][j] == 'E')
            count++;
        dp[i][j] += count;
        return count;
    }
}
