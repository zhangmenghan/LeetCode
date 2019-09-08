package com.utils;

import java.util.Stack;

class MyQueue {
    /** Initialize your data structure here. */
    Stack<Integer> inout = new Stack<Integer>();
    Stack<Integer> ouput = new Stack<Integer>();

    /** Push element x to the back of queue. */
    public void push(int x) {
        inout.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return ouput.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(ouput.isEmpty()){
            while (!inout.isEmpty()){
                ouput.push(inout.pop());
            }
        }
        return ouput.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return ouput.isEmpty() && inout.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
