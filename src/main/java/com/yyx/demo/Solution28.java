package com.yyx.demo;

/**
 * @description: 对称的二叉树
 * @author: yangyuxiang9
 * @create: 2022-04-02 13:52
 **/
public class Solution28 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left,root.right);
    }

    public boolean helper(TreeNode root1,TreeNode root2){
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return root1.val == root2.val && helper(root1.left,root2.right) && helper(root1.right,root2.left);
    }
}
