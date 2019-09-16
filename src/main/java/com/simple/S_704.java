package com.simple;

import java.util.Arrays;

public class S_704 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (target < nums[left] || target > nums[right]) {
            return -1;
        }
        if (nums[left] == target) {
            return left;
        } else if (nums[right] == target) {
            return right;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        S_704 s_704 = new S_704();
        int[] input = {-1,0,3,5,9,12};
        System.out.println(s_704.search(input,4));
    }
}
