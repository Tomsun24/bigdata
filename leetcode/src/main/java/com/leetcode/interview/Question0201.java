package com.leetcode.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 02.01. 移除重复节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 *
 * 示例1:
 *
 *  输入：[1, 2, 3, 3, 2, 1]
 *  输出：[1, 2, 3]
 * 示例2:
 *
 *  输入：[1, 1, 1, 1, 2]
 *  输出：[1, 2]
 * 提示：
 *
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 * 进阶：
 *
 * 如果不得使用临时缓冲区，该怎么解决？
 *
 */
public class Question0201 {


    //解法 使用list来保存首次出现的节点
    public ListNode removeDuplicateNodes(ListNode head) {
        //判断是否为空，如果为空直接返回
        if(head==null){
            return null;
        }
        //head保证指针的头部之后返回 用新的参数代表链表
        ListNode pos=head;
        //使用几个list保存每个第一个出现的节点值
        List<Integer> nodeList= new ArrayList<>();
        //放入第一个节点的值
        nodeList.add(head.val);
        //当前节点的下一个节点是否为空
        while (pos.next!=null){
            //判断下一个节点的值是否在集合list中,如果不在放入集合list中
            if(!nodeList.contains(pos.next.val)){
                nodeList.add(pos.next.val);
                //指针下移
                pos=pos.next;
            }else {
                //如果不存在则使得当前节点下一个节点下移到当前节点的下下一个节点
                pos.next=pos.next.next;
            }

        }
        //可有可无
        pos.next=null;
        return  head;

    }
}
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
