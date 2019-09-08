package com.simple;

import com.util.ListNode;

public class S_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = findLen(headA);
        int lenB = findLen(headB);

        while (lenA < lenB){
            headB = headB.next;
            lenB--;
        }

        while (lenA > lenB){
            headA = headA.next;
            lenA--;
        }

        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    public int findLen(ListNode head){
        int len = 0;
        while (head != null){
            head = head.next;
            len++;
        }
        return len;
    }
}
