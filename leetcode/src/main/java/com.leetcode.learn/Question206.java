package com.leetcode.learn;

import java.io.UnsupportedEncodingException;

/**
 *
 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 进阶:
 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class Question206 {
    public static void main(String[] args) {
    }
    //方法1 迭代的做法时间复杂度O(n) 空间复杂度O(1)
    public ListNode reverseList(ListNode head) {
        //需要三个指针
        // 一个指向当前节点，curr
        // 一个指向当前节点的下一个节点(为了占位，不然当前节点的下一个节点被替换了就会找不到之前的下一个节点，故提出这个节点占位使用) next
        // 一个指向当前节点的前一个节点 用来将当前的节点next变成该值 prev
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while (curr!=null){
            //用next占住下一个节点的位置
            next=curr.next;
            //当前节点的下一个值指向前面的prev
            curr.next=prev;
            //替换prev,往后移动指向当前的curr
            prev=curr;
            //curr节点后移指向当前的next
            curr=next;
        }
    //返回prev节点 curr和next都是null
    return  prev;
    }

    //方法2、使用栈的做法遍历全部的节点，使用栈的特点 先进后出的规整，原理就像堆叠盘子
}
