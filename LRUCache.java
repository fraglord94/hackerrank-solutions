package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aronee Dasgupta on 9/22/2017.
 */
public class LRUCache {
    Map<Integer, Page> map;
    int capacity;
    int count;
    Page head, tail;

    LRUCache(int n) {
        map = new HashMap<>(n);
        this.capacity = n;
        this.head = new Page(-1, -1);
        this.tail = new Page(-1, -1);
        this.head.next = tail;
        this.tail.prev = head;
        this.count = 0;
    }

    private void addToHead(Page page) {
        page.next = head.next;
        page.next.prev = head;
        page.prev = head;
        head.next = page;
    }

    private void delete(Page page) {
        page.prev.next = page.next;
        page.next.prev = page.prev;
    }

    public void set(int key, int value) {
        if (map.get(key) == null) {
            Page page = new Page(key, value);
            map.put(key, page);
            if (count < capacity) {
                count++;
                addToHead(page);

            } else {
                map.remove(tail.prev.key);
                delete(tail.prev);
                addToHead(page);
            }
        } else {
            Page page = map.get(key);
            page.val = value;
            delete(page);
            addToHead(page);
        }
    }

    public int get(int key) {
        if (map.get(key) != null) {
            Page page = map.get(key);
            int result = page.val;
            delete(page);
            addToHead(page);
            return result;
        }
        return -1;
    }
}

class Page {
    int val;
    int key;
    Page prev;
    Page next;

    Page(int key, int val) {
        this.key = key;
        this.val = val;
    }
}