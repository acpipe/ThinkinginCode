package com.hit.learn.leatcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class solution692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> keyword2count = new HashMap<>();
        for (String keyword : words) {
            keyword2count.put(keyword, keyword2count.getOrDefault(keyword, 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> keyword2count.get(a).equals(keyword2count.get(b))
            ? b.compareTo(a) : keyword2count.get(a) - keyword2count.get(b));
        for (String keyword : keyword2count.keySet()) {
            pq.add(keyword);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<String> list = new LinkedList<>();
        while (!pq.isEmpty()) {
            list.add(0, pq.poll());
        }
        return list;
    }

}
