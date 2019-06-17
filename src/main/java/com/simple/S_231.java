package com.simple;

public class S_231 {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n -1)) == 0);
    }

    public static void main(String[] args) {
        S_231 s_231 = new S_231();
        System.out.println(s_231.isPowerOfTwo(16));
    }
}
