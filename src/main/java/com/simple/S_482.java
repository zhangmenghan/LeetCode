package com.simple;

public class S_482 {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        char[] SChars = S.toCharArray();
        for (int i = S.length()-1,j=0; i >= 0; ) {
            if (j < K){
                if (SChars[i] != '-'){
                    if (SChars[i] >= 'a' && SChars[i] <= 'z') {
                        sb.append(Character.toUpperCase(SChars[i]));
                    } else {
                        sb.append(SChars[i]);
                    }
                    j++;
                }
                i--;
            }else if (j == K) {
                j = 0;
                sb.append('-');
            }
        }
        if (sb.length() > 1 && sb.substring(sb.length() - 1).equals("-")) {
            return sb.reverse().substring(1);
        }
        return sb.reverse().toString();
    }
}
