package com.simple;

public class Thirty_five {

    public int searchInsert(int[] nums, int target) {
        int location = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[location] >= target)
                break;
            location++;
        }

        return location--;
    }

    public static void main(String[] args) {
        Thirty_five thirty_five = new Thirty_five();
        int []nums = {1,3,5,6};
        int result = thirty_five.searchInsert(nums,5);
        System.out.println(result);
    }
}
