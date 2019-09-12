package com.simple;

public class S_521 {

    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }

        return Math.max(a.length(),b.length());
    }

    public static void main(String[] args) {
        S_521 s_521 = new S_521();
        String a = "asd";
        String b = "das";
        System.out.println(s_521.findLUSlength(a,b));
    }
}
