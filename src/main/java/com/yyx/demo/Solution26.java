package com.yyx.demo;

import javax.swing.tree.TreeNode;

/**
 * @description: 树的子结构
 * @author: yangyuxiang9
 * @create: 2022-04-01 20:26
 **/
public class Solution26 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        public boolean isSubStructure(TreeNode A, TreeNode B) {
            if (A == null || B == null) return false;
            if (dfs(A,B)) return true;
            return isSubStructure(A.left,B) || isSubStructure(A.right,B);
        }

        public boolean dfs(TreeNode A,TreeNode B){
            if (B == null) return true;
            if (A == null || A.val != B.val) return false;
            return dfs(A.right, B.right) && dfs(A.left,B.left);
        }
    }


    class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            if(A==null || B==null) return false;//约定空树不是任意一个树的子结构
            if(helper(A,B)) return true;
            return isSubStructure(A.left,B) || isSubStructure(A.right,B);//递归判断A树所有子树是否包含B树
        }
        //判断A树根节点值和B树根节点值是否相等，
        // 若不等，返回false，若相等在递归判断A树的孩子节点和B树的的孩子节点是否对应相等，
        // 若相等，就说明A的子结构包含B树，返回true。否者就不包含，返回false
        public boolean helper(TreeNode A,TreeNode B){
            if(B==null) return true;
            if(A==null || A.val!=B.val) return false;//A树为空或者A节点的值不等于B结点的值，返回false
            return helper(A.left,B.left) && helper(A.right,B.right);//当A.val==B.val时，递归判断A树的子节点和B树的子节点是否对应相等
        }
    }

}

