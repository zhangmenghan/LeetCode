package com.simple;

public class S_696 {

    public int countBinarySubstrings(String s) {
        int n = s.length();
        int[][] a = new int[n][2];
        int[][] b = new int[n][2];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                a[i][0] = 1 + (i - 1 >= 0 ? a[i - 1][0] : 0);
            } else {
                a[i][1] = 1 + (i - 1 >= 0 ? a[i - 1][1] : 0);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                b[i][0] = 1 + (i + 1 < n ? b[i + 1][0] : 0);
            } else {
                b[i][1] = 1 + (i + 1 < n ? b[i + 1][1] : 0);
            }

        }

        long ans = 0;
        for (int i = 0; i + 1 < n; i++) {
            ans += Math.min(a[i][0], b[i + 1][1]);
            ans += Math.min(a[i][1], b[i + 1][0]);
        }

        return (int) ans;
    }
}
