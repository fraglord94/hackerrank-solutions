//import java.util.*;
//import java.util.function.Function;
//
//public class GraphBFS {
//    public List<String> findItinerary(String[][] tickets) {
//        for (String[] ticket : tickets)
//            targets.computeIfAbsent(ticket[0], new Function<String, PriorityQueue<String>>() {
//                @Override
//                public PriorityQueue<String> apply(String k) {
//                    return new PriorityQueue();
//                }
//            }).add(ticket[1]);
//        visit("JFK");
//        return route;
//    }
//
//    Map<String, PriorityQueue<String>> targets = new HashMap<>();
//    List<String> route = new LinkedList();
//
//    void visit(String airport) {
//        while(targets.containsKey(airport) && !targets.get(airport).isEmpty())
//            visit(targets.get(airport).poll());
//        route.add(0, airport);
//    }
//}
