package com.simple;
import java.util.Arrays;

public class S_645 {

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                result[0] = nums[i];
            }
        }
        long temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += i + 1;
            temp -= nums[i];
        }
        temp += result[0];
        result[1] = (int) temp;
        return result;
    }

    public static void main(String[] args) {
        S_645 s_645 = new S_645();
        int[] input = {3,2,2};
        int[] result = s_645.findErrorNums(input);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
