package org.scanner;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode rsl = new ListNode();
        ListNode head = rsl;
        while (list1 != null || list2 != null) {
            rsl.next = new ListNode();
            if (list1 == null) {
                rsl.val = list2.val;
                list2 = list2.next;
            } else if (list2 == null) {
                rsl.val = list1.val;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                rsl.val = list1.val;
                list1 = list1.next;
            } else {
                rsl.val = list2.val;
                list2 = list2.next;
            }

            if (list1 != null || list2 != null) {
                rsl = rsl.next;
            }
        }

//        rsl.val = list1 != null ? list1.val : list2.val;
        return head;
    }

    public ListNode mergeTwoLists_var1(ListNode list1, ListNode list2) {
        ListNode rsl = new ListNode();
        ListNode head = rsl;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                rsl.next = list1;
                list1 = list1.next;
            } else {
                rsl.next = list2;
                list2 = list2.next;
            }
            rsl = rsl.next;
        }
        rsl.next = (list1 != null) ? list1 : list2;
        return head.next;    }
}