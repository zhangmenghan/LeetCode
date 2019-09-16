package com.simple;

public class S_796 {

    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        for (int i = 0; i < A.length(); i++) {
            if ((A.substring(i) + A.substring(0, i)).equals(B)) {
                return true;
            }
        }
        return false;
    }
}
