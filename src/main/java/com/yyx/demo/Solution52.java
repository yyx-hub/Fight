package com.yyx.demo;

/**
 * @description: 两个链表第一个公共节点
 * @author: yangyuxiang9
 * @create: 2022-04-11 19:31
 **/
public class Solution52 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode FindFirstCommonNode(ListNode headA , ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A == null ? headB : A.next;
            B = B == null ? headA : B.next;
        }
        return B;
    }
}
