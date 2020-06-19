package com.leetcode.learn;

import scala.Int;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2

 */
public class Question169 {
    public static void main(String[] args) {
        int[] arr={2};
        System.out.printf(majorityElement(arr)+"------");

    }
    public static  int majorityElement(int[] nums) {
        Map<Integer, Integer> kvMap=new HashMap<>();
        int length=nums.length;
        for (int i = 0; i < length; i++) {
            if (kvMap.get(nums[i])!=null){
                if(kvMap.get(nums[i])+1>(length)/2){
                 return nums[i];
                }
                kvMap.put(nums[i],kvMap.get(nums[i])+1);
            }else{
                kvMap.put(nums[i],1);
            }

        }
        return nums[0];

    }
}
