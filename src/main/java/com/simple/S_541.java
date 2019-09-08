package com.simple;

public class S_541 {

    public String reverseStr(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i = i + 2 * k) {
            if (s.length() >= (i + k)) {
                stringBuilder.append(new StringBuilder(s.substring(i, i + k)).reverse());
            } else {
                stringBuilder.append(new StringBuilder(s.substring(i)).reverse());
                break;
            }
            if ((i + 2 * k) <= s.length()) {
                stringBuilder.append(s.substring(i + k, i + 2 * k));
            } else {
                stringBuilder.append(s.substring(i + k));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        S_541 s_541 = new S_541();
        System.out.println(s_541.reverseStr("abcdefg",2));
    }
}
