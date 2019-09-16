package com.simple;

import java.util.ArrayList;
import java.util.List;

public class S_728 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = left ; i<=right; i++){
            int temp = i;
            int flag = 1;
            while (temp > 0){
                int temp2 = temp % 10;
                if (temp2 == 0){
                    flag = 0;
                    break;
                }
                if (i % temp2 != 0){
                    flag = 0;
                    break;
                }
                temp = temp / 10;
            }

            if (flag == 1){
                result.add(i);
            }else {
                continue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        S_728 s_728 = new S_728();
        System.out.println(s_728.selfDividingNumbers(1,22));
    }
}
