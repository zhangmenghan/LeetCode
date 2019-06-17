package com.simple;

public class Hundred_seventy_two {
    public int trailingZeroes(int n) {
        int result = 0;
        while (n > 4) {
            n /= 5;
            result += n;
        }
        return result;
    }
}
