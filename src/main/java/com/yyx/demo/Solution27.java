package com.yyx.demo;

import javax.swing.tree.TreeNode;

/**
 * @description: 镜像二叉树
 * @author: yangyuxiang9
 * @create: 2022-04-02 11:09
 **/
public class Solution27 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
}
