package com.leetcode.learn;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 *
 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

 示例：

 输入：nums = [-1,2,1,-4], target = 1
 输出：2
 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。

 提示：

 3 <= nums.length <= 10^3
 -10^3 <= nums[i] <= 10^3
 -10^4 <= target <= 10^4
 */
public class Question16 {
    public static void main(String[] args) {
        int[] arr={-1,2,1,-4};
        System.out.printf(threeSumClosest(arr, 1)+"sd");


    }

    //时间复杂度 (nlogn)+O(n2)=O(n2)
    public static  int threeSumClosest(int[] nums, int target) {
        //首先对乱序数据进行排序 从小到大 时间复杂度 O(nlogn)
        Arrays.sort(nums);
        //定义最终返回的一个目标值
        int ans=nums[0]+nums[1]+nums[2];
        //将整个数据进行遍历定义一个开始的数值
        //然后使用两个指针，范围为i+1至num.length-1使用不断while不断循环逼近当前值到目标值
        for (int i = 0; i < nums.length; i++) {
            int start=i+1;
            int end =nums.length-1;
            while (start<end){
                int sum=nums[i]+nums[start]+nums[end];
                //如果当前加出来的数值更加接近于目标值(target)则将ans换成当前的数值
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }
                //如果当前三数值是大于目标值(target)则右指针往左移动
                if(sum>target){
                    end--;
                }
                //如果当前三数值下于目标值(target)则左指针往右移动
                else if(sum<target){
                    start++;
                }else {
                    return ans;
                }
            }
        }
        return ans;
    }
}
