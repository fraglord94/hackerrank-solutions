import java.util.ArrayList;
import java.util.List;

public class FallingSquares {
    public List<Integer> fallingSquares(int[][] positions) {
        List<Square> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int a[] : positions) {
            Square square = new Square(a[0], a[0] + a[1], a[1], a[1]);
            int h = find(list, square);
            ans.add(h);
        }
        return ans;
    }

    int find(List<Square> list, Square square) {
        int previousHeight = 0;
        for (Square s : list) {
            if (s.right < square.left)
                continue;
            if (s.left > square.right)
                continue;
            previousHeight = Math.max(s.height, previousHeight);
        }
        square.height = square.height + previousHeight;
        list.add(square);
        return square.height;
    }

    class Square {
        int left;
        int right;
        int side;
        int height;

        public Square(int left, int right, int side, int height) {
            this.left = left;
            this.right = right;
            this.side = side;
            this.height = height;
        }


    }
}
