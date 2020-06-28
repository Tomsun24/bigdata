package com.leetcode.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 */
public class Question20 {

    public static void main(String[] args) {
        String s="()[]{}";
        System.out.printf( isValid(s)+"---");

    }


    //解法使用栈的做法（先进后出）
    public static boolean isValid(String s) {
        int length=s.length();
        //先定义一个map 反向放入不同的括号
        Map<Character,Character> ifMap=new HashMap<>();
        ifMap.put(')','(');
        ifMap.put('}','{');
        ifMap.put(']','[');
        //定义一个栈 将每一个
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < length; i++) {
            if(ifMap.containsKey(s.charAt(i))){
                char a=st.isEmpty()?'1':st.pop();
                if(a!=ifMap.get(s.charAt(i))){
                    return false;
                }
            }else {
                st.push(s.charAt(i));
            }

        }
        return  st.isEmpty();
    }
}
