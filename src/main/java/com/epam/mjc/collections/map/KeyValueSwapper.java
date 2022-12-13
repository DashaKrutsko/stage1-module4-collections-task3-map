package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {

    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapMap = new HashMap<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            if (swapMap.containsKey(e.getValue())) {
                if (swapMap.get(e.getValue()) > e.getKey()) {
                    swapMap.put(e.getValue(), e.getKey());
                }
            } else {
                swapMap.put(e.getValue(), e.getKey());
            }
        }
        return swapMap;
    }
}
