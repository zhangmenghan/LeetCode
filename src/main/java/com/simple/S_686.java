package com.simple;

import java.util.HashSet;
import java.util.Set;

public class S_686 {

    public int repeatedStringMatch(String A, String B) {
        Set<Character> set = new HashSet<Character>();
        for (char c : A.toCharArray()) {
            set.add(c);
        }
        for (char c : B.toCharArray()) {
            if (!set.contains(c)) {
                return -1;
            }
        }

        StringBuilder stringBuilder = new StringBuilder(A);
        for (int i = 0; i < B.length(); i++) {
            if (stringBuilder.toString().contains(B)) {
                return i + 1;
            }
            stringBuilder.append(A);
        }
        return -1;
    }

    public static void main(String[] args) {
        S_686 s_686 = new S_686();
        s_686.repeatedStringMatch("abcd","cdabcdab");
    }
}
