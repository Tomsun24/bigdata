package com.leetcode.learn;

import java.util.LinkedList;
import java.util.Queue;

public class Question225 {
}


class MyStack {


    /** Initialize your data structure here. */
    public MyStack() {

    }

    private Queue<Integer> q1=new LinkedList<Integer>();
    private Queue<Integer> q2=new LinkedList<Integer>();
    private int top;
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top=x;

    }
//
//    /** Removes the element on top of the stack and returns that element. */
//    public int pop() {
//        q1.remove();
//       //  top=q1.
//
//    }
//
//    /** Get the top element. */
//    public int top() {
//
//    }
//
//    /** Returns whether the stack is empty. */
//    public boolean empty() {
//
//    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */