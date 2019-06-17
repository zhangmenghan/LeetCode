package com.simple;

public class Sixty_seven {
    public String addBinary(String a, String b) {
        int length = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = length;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 2);
            length = sum / 2;
        }
        if (length != 0) {
            sb.append(length);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Sixty_seven sixty_seven = new Sixty_seven();
        String result = sixty_seven.addBinary("10","101");
        System.out.println(result);
    }
}
