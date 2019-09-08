package com.simple;

public class S_605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int count = 0;
        int i = 0;
        while (i < length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                count++;
                flowerbed[i] = 1;
            }
            if (count >= n) {
                return true;
            }
            i++;
        }
        if (count >= n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        S_605 s_605 = new S_605();
        System.out.println(s_605.canPlaceFlowers(flowerbed,n));
    }
}
