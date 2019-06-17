package com.simple;

public class S_263 {
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        int[] divisors = new int[]{2,3,5};
        for (int divisor : divisors) {
            while (num % divisor == 0) {
                num /= divisor;
            }
        }
        return num == 1;
    }
}
