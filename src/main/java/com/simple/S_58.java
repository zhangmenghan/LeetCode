package com.simple;

public class S_58 {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        int n = s.length() - 1;
        while (n >= 0 && s.charAt(n) != ' ') {
            n--;
        }
        return s.length() - n - 1;
    }

    public static void main(String[] args) {
        S_58 fifty_eight = new S_58();
        int result = fifty_eight.lengthOfLastWord("ab");
        System.out.println(result);
    }
}
