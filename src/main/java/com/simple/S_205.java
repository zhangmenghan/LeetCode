package com.simple;

import java.util.HashMap;
import java.util.Map;

public class S_205 {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || s.length() == 0) {
            return (t == null || t.length() == 0);
        }
        if (t == null || t.length() == 0) {
            return (s == null || s.length() == 0);
        }
        if(s.length() != t.length()){
            return false;
        }

        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        Map<Character,Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(schar[i])){
                if(map.get(schar[i]) != tchar[i]){
                    return false;
                }
            }else {
                if (map.containsValue(tchar[i])){
                    return false;
                }
                map.put(schar[i],tchar[i]);
            }
        }

        return true;
    }
}
