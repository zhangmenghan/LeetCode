package com.simple;

import java.util.HashSet;
import java.util.Set;

public class S_202 {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }

        Set<Integer> set = new HashSet();
        while (n != 1) {
            String str = String.valueOf(n);
            n = 0;
            for (int i = 0; i < str.length(); i++) {
                int temp = Character.getNumericValue(str.charAt(i));
                n += temp * temp;
            }
            if (n == 1) {
                return true;
            }
            if (!set.add(n)) {
                return false;
            }
        }
        return false;
    }
}
