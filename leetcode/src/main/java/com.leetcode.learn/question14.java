package com.leetcode.learn;

/**
 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

 示例 1:

 输入: ["flower","flow","flight"]
 输出: "fl"
 示例 2:

 输入: ["dog","racecar","car"]
 输出: ""
 解释: 输入不存在公共前缀。
 说明:

 所有输入只包含小写字母 a-z
 */
public class question14 {
    public static void main(String[] args) {
        String[] arrString={"flower","flow","flight"};
        String[] arrString2={"12","1"};
        System.out.printf(longestCommonPrefix(arrString));

    }
    public static  String longestCommonPrefix(String[] strs) {
      if(strs==null && strs.length==0){
          return "";
      }
      int length = strs[0].length();
      int count = strs.length;
      for (int i = 0; i < length; i++) {
         char ca= strs[0].charAt(i);
          for (int i1 = 1; i1 < count; i1++) {
              if(i==strs[i1].length() || ca!=strs[i1].charAt(i)){
                  return strs[0].substring(0,i);
              }
          }
      }
      return  strs[0];
    }
}
