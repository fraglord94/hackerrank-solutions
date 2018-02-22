package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LoggerRateLimiter {
    Map<String, Integer> map;

    public LoggerRateLimiter() {
        map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!map.containsKey(message) || timestamp - map.get(message) >= 10) {
            map.put(message, timestamp);
            return true;
        }
        return false;
    }
}
