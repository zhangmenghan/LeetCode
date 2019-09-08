package com.simple;

public class S_167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            long sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                int[] res = new int[2];
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
        }
        return new int[] {-1, -1};
    }
}
