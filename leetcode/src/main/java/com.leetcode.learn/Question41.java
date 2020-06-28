package com.leetcode.learn;

import org.apache.spark.sql.sources.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 41. 缺失的第一个正数
 *
 * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。 
 *
 * 示例 1:
 *
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 *
 * 输入: [7,8,9,11,12]
 * 输出: 1
 *  
 *
 * 提示：
 *
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的额外空间。
 */
public class Question41 {
    public static void main(String[] args) {
        int[] arr={0,2,2,1,1};

        System.out.printf(firstMissingPositive(arr)+"---");

    }

    public static  int firstMissingPositive(int[] nums) {
        List<Integer> alist=new ArrayList<>();
        int length=nums.length;
        int ans=0;
        for (int i = 0; i < length; i++) {
            if(nums[i]>nums.length+1||nums[i]<=0||alist.contains(nums[i])){
                continue;

            }else {
                alist.add(nums[i]);
            }
        }
        Collections.sort(alist);
        for (int i = 0; i < alist.size(); i++) {
            if(i+1!=alist.get(i)){
                ans=i+1;
                return ans;
            }
        }
        ans=alist.size()+1;
        return ans;
    }

}
