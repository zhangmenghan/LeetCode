package com.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S_599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1 == null || list2 == null) {
            return new String[0];
        }
        Map<String, Integer> map1 = putIntoMap(list1);
        Map<String, Integer> map2 = putIntoMap(list2);
        int leastIndexSum = Integer.MAX_VALUE;
        List<String> resultList = new ArrayList<String>();
        for (String key1 : map1.keySet()) {
            if (map2.containsKey(key1)) {
                int indexSum = map1.get(key1) + map2.get(key1);
                if (indexSum < leastIndexSum) {
                    resultList.clear();
                    resultList.add(key1);
                    leastIndexSum = indexSum;
                } else if (indexSum == leastIndexSum) {
                    resultList.add(key1);
                }
            }
        }
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    private Map<String, Integer> putIntoMap(String[] list) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < list.length; i++) {
            map.put(list[i], i);
        }
        return map;
    }

    public static void main(String[] args) {

        S_599 s_599 = new S_599();
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] list = s_599.findRestaurant(list1,list2);
        System.out.println(list[0]);
    }
}
