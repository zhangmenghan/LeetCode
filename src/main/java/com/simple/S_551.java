package com.simple;

public class S_551 {

    public boolean checkRecord(String s) {
        int aCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aCount++;
                if (aCount > 1) {
                    return false;
                }
            } else if (s.charAt(i) == 'L') {
                int continuousLCount = 0;
                while (i < s.length() && s.charAt(i) == 'L') {
                    i++;
                    continuousLCount++;
                    if (continuousLCount > 2) {
                        return false;
                    }
                }
                i--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        S_551 s_551 = new S_551();
        System.out.println(s_551.checkRecord("ALLAPPL"));
    }
}
