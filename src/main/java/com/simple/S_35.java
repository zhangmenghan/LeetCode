package com.simple;

public class S_35 {

    public int searchInsert(int[] nums, int target) {
        int location = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[location] >= target) {
                break;
            }
            location++;
        }

        return location--;
    }

    public static void main(String[] args) {
        S_35 thirty_five = new S_35();
        int []nums = {1,3,5,6};
        int result = thirty_five.searchInsert(nums,5);
        System.out.println(result);
    }
}
