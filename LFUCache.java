//package hackerrank.algorithms;
//
//import java.util.Comparator;
//import java.util.Map;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class LFUCache {
//    private long timeStamp;
//    private Queue <Element>minHeap;
//    private Map<Integer, Element> hashMap;
//    private int capacity;
//
//    public LFUCache(int capacity) {
//        this.capacity = capacity;
//        minHeap = new PriorityQueue((Comparator<Element>) (o1, o2) -> {
//            if(o1.times == o2.times){
//                return (int)o1.timestamp -(int) o2.timestamp;
//            }
//            else
//            return o1.times - o2.times;
//        });
//    }
//
//    public int get(int key) {
//
//    }
//
//    public void put(int key, int value) {
//
//    }
//
//    class Element {
//        private long timestamp;
//        private int key;
//        private int value;
//        private int times;
//
//        public Element(long timestamp, int key, int value, int times) {
//            this.timestamp = timestamp;
//            this.key = key;
//            this.value = value;
//            this.times = times;
//        }
//    }
//}
