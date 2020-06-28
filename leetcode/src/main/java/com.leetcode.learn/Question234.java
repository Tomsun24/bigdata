package com.leetcode.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class Question234 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> aList=new ArrayList<Integer>();
        ListNode currentNode=head;
        while (currentNode!=null){
            aList.add(currentNode.val);
            currentNode=currentNode.next;
        }
        int start=0;
        int end=aList.size()-1;
        while (start<end){
            if(!aList.get(start).equals(aList.get(end))){
                return false;

            }
            start++;
            end--;
        }


        return true;
    }

}
