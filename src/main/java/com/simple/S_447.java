package com.simple;

import java.util.HashMap;
import java.util.Map;

public class S_447 {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;

        if (points == null || points.length == 0|| points[0].length == 0){
            return result;
        }

        int totalPts = points.length;

        Map<Long,Integer> map = new HashMap<Long, Integer>();

        for (int i = 0; i < totalPts; i++) {
            for (int j = 0; j < totalPts; j++) {
                if (i == j){
                    continue;
                }
                long d = calcDistance(points[i],points[j]);
                map.put(d,map.getOrDefault(d,0) + 1);
            }

            for (int val : map.values()){
                result += val * (val - 1);
            }
            map.clear();
        }

        return result;
    }

    private long calcDistance(int[] p1,int[] p2){
        long x = p2[0] - p1[0];
        long y = p2[1] - p1[1];
        return x*x+y*y;
    }
}
