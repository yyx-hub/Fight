package com.yyx.demo;

/**
 * @description: 删除链表的节点
 * @author: yangyuxiang9
 * @create: 2022-04-12 16:05
 **/
public class Solution18 {
    public Solution52.ListNode deleteNode(Solution52.ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        Solution52.ListNode cur = head;
        while (cur.next != null && cur.next.val != val) {
            cur = cur.next;
        }
        if (cur.next == null) return head;
        cur.next = cur.next.next;
        return head;
    }
}
