package com.simple;

public class S_409 {
    public int longestPalindrome(String s) {
        int[] counts = new int[56];
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                counts[c - 'A' + 33]++;
            } else {
                counts[c - 'a']++;
            }
        }
        boolean hasOdd = false;
        int len = 0;
        for (int i = 0; i < 56; i++) {
            if (counts[i] % 2 != 0) {
                hasOdd = true;
                if (counts[i] > 1) {
                    len += counts[i] - 1;
                }
            } else {
                len += counts[i];
            }
        }
        return hasOdd ? len + 1 : len;
    }

    public static void main(String[] args) {
        String a = "a";
        S_409 s_409 = new S_409();
        System.out.println(s_409.longestPalindrome(a));
    }

}
