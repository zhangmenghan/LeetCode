package com.simple;

public class S_520 {

    public boolean detectCapitalUse(String word) {
        int flag = 1;
        char[] chars = word.toCharArray();
        for (char ch : chars){
            if (ch >= 'a' && ch <= 'z'){
                flag = 0;
                break;
            }else {
                continue;
            }
        }

        if (flag == 1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String input = "9120";
        S_520 s_520 = new S_520();
        System.out.println(s_520.detectCapitalUse(input));
    }
}
