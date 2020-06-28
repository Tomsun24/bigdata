package com.leetcode.learn;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 *
 * 示例: 
 *
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * 进阶:
 *
 * 如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 *
 */
public class Question209 {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        System.out.printf(minSubArrayLen(7, arr)+"ddd");

    }

    public static int minSubArrayLen(int s, int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int length=nums.length;
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            int sum=0;
            for (int j = i; j < length; j++) {
                sum+=nums[j];
                if(sum-s >=0){
                    ans=Math.min(ans,j-i+1);
                    break;
                }


            }

        }
        return ans==Integer.MAX_VALUE?0:ans;

    }
}
