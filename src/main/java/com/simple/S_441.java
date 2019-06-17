package com.simple;

public class S_441 {
    public int arrangeCoins(int n) {
        int result = 0;
        int cow = 1;
        while (n >= 0){
            result++;
            n = n-cow;
            cow++;
        }

        return result - 1;
    }
}
