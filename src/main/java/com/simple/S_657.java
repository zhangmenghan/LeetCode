package com.simple;

public class S_657 {

    public boolean judgeCircle(String moves) {
        int[] flag = {0,0};
        char[] moveChar = moves.toCharArray();
        int length = moveChar.length;

        for (int i = 0; i <length; i++) {
            if (moveChar[i] == 'R'){
                flag[0]++;
            }else if (moveChar[i] == 'L'){
                flag[0]--;
            }else if (moveChar[i] == 'U'){
                flag[1]++;
            }else if (moveChar[i] == 'D'){
                flag[1]--;
            }
        }

        if (flag[0] == 0 && flag[1] == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        S_657 s_657 = new S_657();
        System.out.println(s_657.judgeCircle("RUL"));
    }

}
