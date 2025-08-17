package org.example;

//import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void getIntersectionNode() {
        Solution solution = new Solution();
        ListNode headA3 = new ListNode(3);
        ListNode headA2 = new ListNode(2);
        headA2.next = headA3;
        ListNode headA1 = new ListNode(1);
        headA1.next = headA2;

        ListNode headB = new ListNode(2);
                solution.getIntersectionNode(headA1, headB);
    }

    @Test
    public void getIntersectionNodeV2() {
        //listA = [4,1,8,4,5],
        ListNode headA5 = new ListNode(5);
        ListNode headA4 = new ListNode(4);
        headA4.next = headA5;
        ListNode headA8 = new ListNode(8);
        headA8.next = headA4;

        ListNode headA1 = new ListNode(1);
        headA1.next = headA8;
        ListNode headA41 = new ListNode(4);
        headA41.next = headA1;

        //listB = [5,6,1,8,4,5],
//        ListNode headB5 = new ListNode(5);
//        ListNode headB4 = new ListNode(4);
//        headB4.next = headB5;
//        ListNode headB8 = new ListNode(8);
//        headB8.next = headB4;
        ListNode headB1 = new ListNode(1);
        headB1.next = headA8;
        ListNode headB6 = new ListNode(6);
        headB6.next = headB1;
        ListNode headB51 = new ListNode(5);
        headB51.next = headB6;

        Solution solution = new Solution();
        solution.getIntersectionNodeV2(headA41, headB51);
    }

    @Test
    public void getIntersectionNodeV21() {
        //listA = [2,6,4],
        ListNode headA4 = new ListNode(4);
        ListNode headA6 = new ListNode(6);
        headA6.next = headA4;
        ListNode headA2 = new ListNode(2);
        headA2.next = headA6;

        //listB = [1,5],
        ListNode headB5 = new ListNode(5);
        ListNode headB1 = new ListNode(1);
        headB1.next = headB5;

        Solution solution = new Solution();
        solution.getIntersectionNodeV2(headA2, headB1);
    }
}