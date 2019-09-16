package com.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S_771 {

    public int numJewelsInStones(String J, String S) {
        char[] jChar = J.toCharArray();
        char[] sChar = S.toCharArray();
        int count = 0;

        List<Character> gem = new ArrayList<>();

        for (int i = 0;i<jChar.length;i++){
            gem.add(jChar[i]);
        }

        for (int i = 0; i < sChar.length; i++) {
            if (gem.contains(sChar[i])){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        S_771 s_771 = new S_771();
        System.out.println(s_771.numJewelsInStones("s",""));
    }
}
