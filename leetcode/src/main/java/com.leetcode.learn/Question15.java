package com.leetcode.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c
 * ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *  
 * 示例：
 *
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class Question15 {
    public static void main(String[] args) {
        int[] arr={0,0,0,0};
        System.out.printf(threeSum(arr)+"\n");

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < length-2; i++) {
             int first=nums[i];
             if(i>0&&first==nums[i-1]){
                 continue;
             }
            int third=length-1;
            int target=-first;

            for (int second = i+1; second < length-1; second++) {

                if(second>i+1&&nums[second]==nums[second-1]){
                    continue;
                }
                while (second<third){
                    if(target >nums[second]+nums[third]){
                        break;
                    }else if(target <nums[second]+nums[third]){
                        third--;
                    }else {
                        if(third<nums.length-1 &&nums[third]==nums[third+1]){
                            break;
                        }
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        resultList.add(list);
                        third--;
                    }
                }
            }
        }
        return resultList;
    }
}

