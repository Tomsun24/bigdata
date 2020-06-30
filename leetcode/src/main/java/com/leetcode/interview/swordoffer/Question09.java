package com.leetcode.interview.swordoffer;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 *  
 *
 * 示例 1：
 *
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 *
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 * 提示：
 *
 * 1 <= values <= 10000
 * 最多会对 appendTail、deleteHead 进行 10000 次调用
 */
public class Question09 {
    public static void main(String[] args) {


    }
}

class CQueue {

    //定义两个栈
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        //初始化栈
        //stack1为输入元素栈
        //stack2为输出元素栈
        stack1 = new Stack<>();
        stack2 = new Stack<>();


    }

    //stack1入栈
    public void appendTail(int value) {
        stack1.push(value);

    }

    public int deleteHead() {
        //先判断stack2是否为空，如果为空，将stack1的数据导入到stack2中
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
              stack2.push(stack1.pop());
            }
        }
        //如果最后stack2还是为空直接返回-1。否则stack2进行出栈
        if(stack2.isEmpty()){
            return -1;
        }else{
            Integer pop = stack2.pop();
            return pop;
        }



    }
}
 // Your CQueue object will be instantiated and called as such:
 // CQueue obj = new CQueue();
 // obj.appendTail(value);
 // int param_2 = obj.deleteHead();



