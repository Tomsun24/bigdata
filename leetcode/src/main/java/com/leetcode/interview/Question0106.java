package com.leetcode.interview;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
 你可以假设字符串中只包含大小写英文字母（a至z）。

 示例1:

 输入："aabcccccaaa"
 输出："a2b1c5a3"
 示例2:

 输入："abbccd"
 输出："abbccd"
 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 提示：

 字符串长度在[0, 50000]范围内。

 */
public class Question0106 {
    public static void main(String[] args) {
     String s="aabcccccaaa";
     System.out.printf( compressString(s));
     List<Integer> list=new ArrayList<>();
     list.add(1);
     list.add(1);
     list.add(2);
     System.out.printf(list.lastIndexOf(1)+"");

    }

    public static String compressString(String S) {
        if(S==null||S.equals("")){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        int length=S.length();
        char tmp=S.charAt(0);
        int num =1;
        for (int i = 1; i < length; i++) {
            if(S.charAt(i)!=tmp){
                sb.append(tmp).append(num);
                tmp= S.charAt(i);
                num=1;
            }else {
                num++;
            }
        }
        sb.append(tmp).append(num);
        return sb.length()>S.length()? S:sb.toString();
    }
}
