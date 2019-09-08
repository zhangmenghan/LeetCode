package com.simple;

public class S_633 {
    public boolean judgeSquareSum(int c) {
        int maxNum = ((int)Math.sqrt(c/2+1))+1;
        for (int i = 0; i <= maxNum; i++) {
            int firstNum = i*i;
            int secondNum = c - firstNum;
            if (isSquareNum(secondNum)) {
                return true;
            }
        }

        return false;
    }

    public boolean isSquareNum(int c){
        int intNum = (int)Math.sqrt(c);
        double douNum = Math.sqrt(c);

        if ((intNum*10) == (douNum*10)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        S_633 s_633 = new S_633();
        System.out.println(s_633.judgeSquareSum(0));
    }
}
