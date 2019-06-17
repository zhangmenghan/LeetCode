package com.simple;

public class Sixty_nine {
    public int mySqrt(int x) {
        long left = 0;
        long right = x / 2 + 1;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long result = mid * mid;
            if (result == (long) x) {
                return (int) mid;
            } else if (result > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        Sixty_nine sixty_nine = new Sixty_nine();
        int result = sixty_nine.mySqrt(16);
        System.out.println(result);
    }
}
