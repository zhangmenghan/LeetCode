package com.simple;

public class S_9 {

    public boolean isPalindrome(int x) {
        String numStr = String.valueOf(x);
        for(int i = 0;i<numStr.length()/2;i++){
            if(numStr.charAt(i) == numStr.charAt(numStr.length()-i-1)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        S_9 palindrome = new S_9();
        boolean result = palindrome.isPalindrome(121);
        System.out.println(result);
    }

}
