package com.leetcode.learn;


/**
 * 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 * 示例：
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class Question11 {
    public static void main(String[] args) {

    }

    //解法  使用双指针的做法
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int result=0;
        while (start<end){
            int rs=(height[start]>height[end]?height[end]:height[start])*(end-start);
            result= Math.max(result,rs);
            if(height[start]>=height[end]){
                end--;
            }else{
                start++;
            }

        }

        return result;
    }
}
