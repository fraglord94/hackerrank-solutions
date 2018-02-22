package hackerrank.algorithms;
public class isSubtree {
    boolean isSame(Node T, Node S){
        if(T == null && S == null) return true; 
        if(T == null || S ==null) return false; 
        return ((T.data == S.data) &&(isSame(T.left,S.left)) &&(isSame(T.right, T.right)));
    }
    boolean isSubtree(Node T, Node S){
        if(S == null) return true;
        if(T == null) return false; 
        if(isSame(T,S)) return true; 
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }
}
