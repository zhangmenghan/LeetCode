package com.simple;

public class S_476 {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0'){
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return Integer.parseInt(sb.toString(),2);
    }
}
