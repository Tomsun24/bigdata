package com.leetcode.learn;

/**
 实现 strStr() 函数。

 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle
 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

 示例 1:

 输入: haystack = "hello", needle = "ll"
 输出: 2
 示例 2:

 输入: haystack = "aaaaa", needle = "bba"
 输出: -1
 说明:

 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。

 */
public class Question28 {
    public static void main(String[] args) {
        System.out.printf( strStr("hello",  "ll")+"");
    }

    //解法一 使用循环遍历的方式进行，字符串截取比较值大小使用equals
    //时间复杂度为O(h-n) 空间复杂度 O(1)
    public static int strStr(String haystack, String needle) {
        //先找出两个字符串的长度
       int h=haystack.length();
       int n=needle.length();
       //循环遍历每个长的那个歌字符串从下标0到总长度-n+1,即保证剩下的字符串长度要小于要比较的长度
       for (int i = 0; i < h-n+1; i++) {
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }


    //解法二 解法一优化
    //只有当我们遇到首字母相同才进行数据比较
    public static int strStr2(String haystack, String needle) {

        int h=haystack.length();
        int n=needle.length();
        if(h<n){
            return -1;
        }
        if(n==0){
            return 0;
        }
        for (int i = 0; i < h-n+1; i++) {
            if(haystack.charAt(i)==needle.charAt(0)){
                if (haystack.substring(i,i+n).equals(needle)) {
                    return i;
                }
            }

        }
        return -1;
    }

}
