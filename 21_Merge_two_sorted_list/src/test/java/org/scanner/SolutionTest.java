package org.scanner;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void mergeTwoLists() {
        ListNode list11 = new ListNode(1);
        ListNode list12 = new ListNode(2);
        ListNode list14 = new ListNode(4);
        list11.next = list12;
        list12.next = list14;

        ListNode list21 = new ListNode(1);
        ListNode list23 = new ListNode(3);
        ListNode list24 = new ListNode(4);
        list21.next = list23;
        list23.next = list24;

        Solution solution = new Solution();
//        ListNode rsl = solution.mergeTwoLists(list11, list21);
        ListNode rsl = solution.mergeTwoLists_var1(list11, list21);
    }

    @Test
    void mergeTwoLists_var1() {
        ListNode list11 = new ListNode(-9);
        ListNode list12 = new ListNode(3);
        list11.next = list12;

        ListNode list21 = new ListNode(5);
        ListNode list22 = new ListNode(7);
        list21.next = list22;

        Solution solution = new Solution();
//        ListNode rsl = solution.mergeTwoLists(list11, list21);
        ListNode rsl = solution.mergeTwoLists_var1(list11, list21);
    }

    @Test
    void mergeTwoLists_var2() {
        ListNode list11 = null;

        ListNode list21 = new ListNode(0);

        Solution solution = new Solution();
        ListNode rsl = solution.mergeTwoLists(list11, list21);
    }
}