package com.yyx.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description: 从上到下打印二叉树
 * @author: yangyuxiang9
 * @create: 2022-04-01 10:39
 **/
public class Solution32 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //题目一：从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
    public int[] levelOrderOne(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        //广度优先BFS 先入先出用队列
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        //根节点入队列
        queue.add(root);

        TreeNode treeNode = null;
        while (!queue.isEmpty()) {
            treeNode = queue.poll();
            list.add(treeNode.val);

            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    //题目二：从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
    public List<List<Integer>> levelOrderTwo(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        //广度优先BFS 先入先出用队列
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        //根节点入队列
        queue.add(root);

        TreeNode treeNode = null;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i >0 ; i--) {
                treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            result.add(list);
        }
        return result;
    }

    //题目三：从上到下打印，第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
    public List<List<Integer>> levelOrderThree(TreeNode root) {
        if (root == null){
            return new LinkedList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        //用链表实现双端队列
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //定义目标改变出入顺序
        boolean flag = true;

        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            TreeNode cur = null;

            // 如果 flag=true，从头出队，子节点从左至右依次加入队尾，（左到右出队）
            if (flag) {
                for (int i = queue.size(); i > 0; i--) {
                    cur = queue.pollFirst();
                    temp.add(cur.val);
                    if (cur.left != null) {
                        queue.add(cur.left);
                    }
                    if (cur.right != null) {
                        queue.add(cur.right);
                    }
                }
            }

            // 如果 flag=false，从队尾出队，子节点从右至左依次加入队头 （右到左出队）
            if (!flag) {
                for (int i = queue.size(); i > 0; i--) {
                    cur = queue.pollLast();
                    temp.add(cur.val);

                    if (cur.right != null) {
                        queue.addFirst(cur.right);
                    }
                    if (cur.left != null) {
                        queue.addFirst(cur.left);
                    }
                }
            }
            // 变换出队顺序
            flag = !flag;
            // 将每行节点值加入List
            result.add(temp);
        }
        return result;
    }
}
