package com.simple;

import java.util.TreeSet;

/**
 * @Auther: zhangmenghan
 * @Date: 2019/9/17 10:51
 * @Description:
 */
public class S_821 {

    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        TreeSet<Integer> cIndices = new TreeSet<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C){
                cIndices.add(i);
            }
        }

        for (int i = 0; i < S.length(); i++) {
            int leftDist = Integer.MAX_VALUE;
            if (cIndices.floor(i) != null){
                leftDist = Math.abs(cIndices.floor(i) - i);
            }
            int rightDist = Integer.MAX_VALUE;
            if (cIndices.ceiling(i) != null){
                rightDist = Math.abs(cIndices.ceiling(i) - i);
            }
            result[i] = Math.min(leftDist,rightDist);
        }

        return result;
    }
}

