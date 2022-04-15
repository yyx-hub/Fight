package com.yyx.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: 复杂链表的复制
 * @author: yangyuxiang9
 * @create: 2022-04-15 10:40
 **/
public class Solution35 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        while (cur != null) {
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = newNode.next;
        }
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        Node newHead = head.next;
        cur = head;
        while (cur != null) {
            Node newCur = cur.next;
            cur.next = newCur.next;
            if (newCur.next != null) {
                newCur.next = newCur.next.next;
            }
            cur = cur.next;
        }
        return newHead;
    }

}
