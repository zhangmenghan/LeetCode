package com.simple;

import java.util.ArrayList;
import java.util.List;

public class S_693 {

    public boolean hasAlternatingBits(int n) {
        List<Integer> result = new ArrayList<Integer>();

        int mod = n % 2;
        result.add(mod);
        n = n/2;

        for (int i = 1;n > 0;i++){
            mod = n % 2;
            if (result.get(i-1) == mod){
                return false;
            }else {
                result.add(mod);
            }
            n = n/2;
        }

        return true;
    }

    public static void main(String[] args) {
        S_693 s_693 = new S_693();
        System.out.println(s_693.hasAlternatingBits(1));
    }

}
