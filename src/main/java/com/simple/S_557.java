package com.simple;

public class S_557 {

    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder sUtil = new StringBuilder();

        for(String word : s.split(" ")){
            sUtil.setLength(0);
            sUtil.append(word);
            stringBuilder.append(sUtil.reverse().toString());
            stringBuilder.append(" ");
        }

        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        S_557 s_557 = new S_557();
        System.out.println(s_557.reverseWords("Let's take LeetCode contest"));
    }
}
