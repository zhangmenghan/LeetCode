package com.utils;

import java.util.Map;
import java.util.HashMap;

public class MyHashSet {
    Map<Integer, Integer> map;

    /** Initialize your data structure here. */
    public MyHashSet() {
        map = new HashMap<>();
    }

    public void add(int key) {
        map.put(key, 0);
    }

    public void remove(int key) {
        if (map.containsKey(key)) {
            map.remove(key);
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return map.containsKey(key);
    }
}
