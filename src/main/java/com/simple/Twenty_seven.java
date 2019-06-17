package com.simple;

public class Twenty_seven {

    public int removeElement(int[] nums, int val) {
        int equal = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != val)
                nums[equal++] = nums[i];
        }
        return equal;
    }

    public static void main(String[] args) {

        int []nums = {0,1,2,2,3,0,4,2};
        Twenty_seven elementRemove = new Twenty_seven();
        int result = elementRemove.removeElement(nums,2);
        System.out.println(result);
    }
}
