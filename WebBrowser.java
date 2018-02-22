package hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class WebBrowser {

    private Map<String, WebPage> map;
    private Queue<WebPage> history;

    public WebBrowser() {
        map = new HashMap<>();
        history = new PriorityQueue<>((o1, o2) -> -o1.visitCount + o2.visitCount);
    }

    class WebPage {
        private String url;
        private int visitCount;

        public WebPage(String url) {
            this.url = url;
            this.visitCount = 0;
        }

        void visistPage() {
            this.visitCount++;
        }
    }
}

