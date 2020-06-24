package com.leetcode.learn;

/**
 * 124. 二叉树中的最大路径和
 *
 * 给定一个非空二叉树，返回其最大路径和。
 *
 * 本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 *
 *        1
 *       / \
 *      2   3
 *
 * 输出: 6
 * 示例 2:
 *
 * 输入: [-10,9,20,null,null,15,7]
 *
 *    -10
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 输出: 42
 *
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class Question124 {
    int result=Integer.MIN_VALUE;
    public static void main(String[] args) {

    }



    public static  int maxPathSum(TreeNode root) {
          int num=getSum(root);
          return num;

    }

    private static int getSum(TreeNode node) {
        if(node==null){
            return 0;
        }
        return 1;

    }

}
