package org.example;

import java.util.Hashtable;

public class Solution {
    public static void main(String[] args) {
        Hashtable<Integer, Boolean> tableA = new Hashtable<>();
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode rsl = null;
        ListNode prevHeadA = null;
        ListNode prevHeadB = null;
        while (headA != null) {
            ListNode temp = headA.next;
            headA.next = prevHeadA;
            prevHeadA = headA;
            headA = temp;
        }

        while (headB != null) {
            ListNode temp = headB.next;
            headB.next = prevHeadB;
            prevHeadB = headB;
            headB = temp;
        }

        ListNode tempHeadB = prevHeadB;
        while (prevHeadA.next != null) {
            if (prevHeadA.val != prevHeadB.val) break;
            tempHeadB = prevHeadB.next;
            rsl = prevHeadA;

        }
        return rsl;
    }

    ;

    public ListNode getIntersectionNodeV2(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null) return null;
//
//        ListNode pA = headA, pB = headB;
//
//        while (pA != pB) {
//            pA = (pA == null) ? headB : pA.next;
//            pB = (pB == null) ? headA : pB.next;
//        }

//        return pA; // Either intersection node or null


        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != tempB) {
            tempA = tempA != null ? tempA.next : headB;
            tempB = tempB != null ? tempB.next : headA;
        }
        return tempA;
    };
}