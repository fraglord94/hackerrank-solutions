import java.util.List;

class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int level = triangle.size() - 2; level>= 0; level--){
            for (int node = 0; node <= level; node++){
                triangle.get(level).set(node,
                        triangle.get(level).get(node) + Math.min(
                                triangle.get(level+1).get(node),
                                triangle.get(level+1).get(node+1)
                        ));
            }
        }
        return triangle.get(0).get(0);
    }
}