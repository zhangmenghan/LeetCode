package com.simple;

public class S_405 {
    public String toHex(int num) {
        char[] hexChars =
                new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
                        'e', 'f'};
        String result = "";

        while (num != 0){
            result = hexChars[(num & 15)] + result;
            num >>>=4;
        }

        return result.isEmpty() ? "0" : result;
    }

    public static void main(String[] args) {
        S_405 s_405 = new S_405();
    }
}
