package hackerrank.algorithms;

import sun.text.normalizer.Trie;

public class FindKthSmallestPairDistance {
    public int smallestDistancePair(int[] a, int k) {
        int buckets[] = new int[Integer.MAX_VALUE];
        int bucket;
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                bucket = Math.abs(a[i] - a[j]);
                buckets[bucket]++;
            }
        }
        for (int x : buckets) {
            if (x >= k) {
                return x;
            }
        }
        return 0;
    }
}
