package com.simple;

import java.util.HashMap;
import java.util.Map;

public class S_532 {

    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }

        Map<Integer,Integer> numsMap = new HashMap<>();

        for (int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(numsMap.toString());

        int result = 0;

        for(int key : numsMap.keySet()){
            if(k == 0) {  //如果两数之差为0，且数组内存在该数的数量在两个以上，那么就是一个k-diff
                if(numsMap.get(key) >= 2){
                    result++;
                }
            } else {
                if(numsMap.containsKey(key + k)){
                    result++;
                }
            }
        }


        return result;
    }


    public static void main(String[] args) {
        S_532 s_532 = new S_532();
        int nums[] = {3, 1, 4, 1, 5};
        int k = 0;
        int res = s_532.findPairs(nums,k);
        System.out.println(res);
    }
}
