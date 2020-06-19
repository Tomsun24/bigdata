package com.leetcode.learn;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 */
public class Question {
    public static void main(String[] args) {
     String s="A man, a plan, a canal: Panama";
        System.out.printf( isPalindrome(s)+"eeee");
    }
    public static boolean isPalindrome(String s) {
        if(s==""){
            return true;
        }
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        return sb.toString().equals(sb.reverse().toString());

    }
}
