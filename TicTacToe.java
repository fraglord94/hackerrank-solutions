package hackerrank.algorithms;

public class TicTacToe {
    int p;
    private int n;
    private int row[];
    private int col[];
    private int d_count;
    private int a_count;

    public TicTacToe(int n) {
        this.row = new int[n];
        this.col = new int[n];
        this.d_count = 0;
        this.a_count = 0;
        this.n = n;
    }

    public int move(int row, int col, int player) {
        if (player == 1)
            p = 1;
        else if (player == 2)
            p = -1;
        if (row == col)
            d_count = d_count + p;
        if (col == (n - row - 1))
            a_count = a_count + p;

        this.row[row] = this.row[row] + p;
        this.col[col] = this.col[col] + p;

        if ((Math.abs(this.row[row]) == n)
                || (Math.abs(this.col[col]) == n)
                || (Math.abs(d_count) == n)
                || (Math.abs(a_count) == n)) {
            return p;
        }
        return 0;
    }

}
