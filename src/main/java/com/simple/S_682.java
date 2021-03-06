package com.simple;

import java.util.Stack;

public class S_682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        int firstLast = Integer.MIN_VALUE;
        int secondLast = Integer.MIN_VALUE;
        for (String op : ops) {
            if ("+".equals(op)) {
                if (!stack.isEmpty()) {
                    firstLast = stack.pop();
                }
                if (!stack.isEmpty()) {
                    secondLast = stack.pop();
                }
                int thisRoundPoints = firstLast + secondLast;

                if (secondLast != Integer.MIN_VALUE) {
                    stack.push(secondLast);
                }
                if (firstLast != Integer.MIN_VALUE) {
                    stack.push(firstLast);
                }
                stack.push(thisRoundPoints);
                sum += thisRoundPoints;

                firstLast = Integer.MIN_VALUE;
                secondLast = Integer.MIN_VALUE;
            } else if ("D".equals(op)) {
                if (!stack.isEmpty()) {
                    int thisRoundPoints = stack.peek() * 2;
                    stack.push(thisRoundPoints);
                    sum += thisRoundPoints;
                }
            } else if ("C".equals(op)) {
                if (!stack.isEmpty()) {
                    int removedData = stack.pop();
                    sum -= removedData;
                }
            } else {
                Integer val = Integer.parseInt(op);
                sum += val;
                stack.push(val);
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        S_682 s_682 = new S_682();
        String[] ops = {"5","2","C","D","+"};
        s_682.calPoints(ops);
    }
}
