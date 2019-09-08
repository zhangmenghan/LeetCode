package com.simple;

public class S_168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0){
            int temp = (n-1) % 26;
            sb.append((char)(temp+65));
            n = (n-1) / 26;
        }

        return sb.reverse().toString();
    }
}
