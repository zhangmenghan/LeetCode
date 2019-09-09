package com.simple;

public class S_665 {
    public boolean checkPossibility(int[] nums) {
        return modifyIMinusOne(nums) || modifyI(nums);
    }

    private boolean modifyI(int[] nums) {
        int[] tmp = nums.clone();
        int len = tmp.length;
        int modifyTimes = 0;
        for (int i = 1; i < len; i++) {
            if (tmp[i] == tmp[i - 1]) {
                continue;
            }
            if (tmp[i] < tmp[i - 1]) {
                modifyTimes++;
                if (modifyTimes > 1) {
                    return false;
                }
                tmp[i] = tmp[i - 1];
            }
        }
        for (int i = 1; i < len; i++) {
            if (tmp[i] == tmp[i - 1]) {
                continue;
            }
            if (tmp[i] < tmp[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private boolean modifyIMinusOne(int[] nums) {
        int[] tmp = nums.clone();
        int len = tmp.length;
        int modifyTimes = 0;
        for (int i = 1; i < len; i++) {
            if (tmp[i] == tmp[i - 1]) {
                continue;
            }
            if (tmp[i] < tmp[i - 1]) {
                modifyTimes++;
                if (modifyTimes > 1) {
                    return false;
                }
                tmp[i - 1] = tmp[i];
            }
        }
        for (int i = 1; i < len; i++) {
            if (tmp[i] == tmp[i - 1]) {
                continue;
            }
            if (tmp[i] < tmp[i - 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        S_665 s_665 = new S_665();
        int[] nums = {2,3,3,2,4};
        System.out.println(s_665.checkPossibility(nums));
    }
}
