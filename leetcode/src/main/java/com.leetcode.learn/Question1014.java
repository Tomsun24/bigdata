package com.leetcode.learn;

/**
 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。

 一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。

 返回一对观光景点能取得的最高分。

  

 示例：

 输入：[8,1,5,2,6]
 输出：11
 解释：i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
  

 提示：

 2 <= A.length <= 50000
 1 <= A[i] <= 1000
 */
public class Question1014 {
    public static void main(String[] args) {
       int[] arr={3,7,2,3};
        System.out.printf( maxScoreSightseeingPair(arr)+"");
    }
    public static int maxScoreSightseeingPair(int[] A) {
//       int length= A.length;
//       int max = A[0]+A[1]-1;
//        for (int i = 0; i < length-1; i++) {
//            for (int j = i+1; j < length ; j++) {
//
//                 max= Math.max(A[i]+i+A[j]-j,max);
//
//            }
//
//        }
//
//
//     return max;
//     官方解法
       int length= A.length;
       int max = A[0];
       int end=0;
        for (int i = 1; i < length; i++) {

            end = Math.max(max + A[i] - i, end);
            max = Math.max(A[i] + i, max);

        }


        return end;
    }
}
