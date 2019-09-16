package com.simple;

public class S_744 {

    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[0] > target) {
            return letters[0];
        }
        int left = 0;
        int right = letters.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                while (letters[mid] > target) {
                    mid--;
                }
                return letters[++mid];
            } else {
                left = mid + 1;
            }
        }
        if (right < letters.length && letters[right] > target) {
            return letters[right];
        }
        return letters[0];
    }

    public static void main(String[] args) {
        S_744 s_744 = new S_744();
        char[] letters = {'c', 'f', 'j'};
        char target = 'z';
        System.out.println(s_744.nextGreatestLetter(letters,target));
    }
}
