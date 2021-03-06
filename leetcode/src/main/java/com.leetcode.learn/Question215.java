package com.leetcode.learn;

import java.util.Arrays;

/**
 * 215. 数组中的第K个最大元素
 *
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 说明:
 *
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 */
public class Question215 {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        System.out.println(findKthLargest(arr,2));


    }

    //解法一 API解法
    public static  int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    //解法二 自己排序解法
    public static  int findKthLargest2(int[] nums, int k) {
        quickSort(nums,0,nums.length);
        return nums[nums.length-k];
    }
    static void quickSort(int[] nums,int start,int end){
        int curr=nums[start];
        while (start<end){
            while (curr<nums[end]){
                end--;



            }


        }




    }

}
