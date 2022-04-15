package com.yyx.demo;

/**
 * @description: 链表中倒数第K个节点
 * @author: yangyuxiang9
 * @create: 2022-04-12 17:07
 **/
public class Sloution22 {
    public Solution52.ListNode getKthFromEnd(Solution52.ListNode head, int k) {
        if (head == null) return null;
        Solution52.ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        if (k > count) return null;
        cur = head;
        while (count > k) {
            cur = cur.next;
            count--;
        }
        return cur;
    }
}
