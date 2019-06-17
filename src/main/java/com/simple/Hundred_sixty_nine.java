package com.simple;

public class Hundred_sixty_nine {
    public int majorityElement(int[] nums) {
        int count = 1;
        int majority = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                majority = nums[i];
            } else if (nums[i] == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}
