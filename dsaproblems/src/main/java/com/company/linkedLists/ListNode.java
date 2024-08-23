package com.company.linkedLists;

public class ListNode {
       int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class AddTwoNumbers {
    //TODO: Hurray - Accepted But 1. Can this be solved using recursion?
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(-1);
        ListNode head = result;
        while(l1 != null || l2 != null){
            int a =0,b=0;
            if(l1 != null)
                a = l1.val;
            if(l2 != null)
                b = l2.val;

            int sum = a + b + carry;
            int value = sum%10;
            carry = sum >= 10 ? 1 : 0;

            if(result.val == -1)
            {
                result.val = value;
            }
            else{
                result.next = new ListNode(value);
                result = result.next;
            }

            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry > 0){
            result.next = new ListNode(carry);
            result = result.next;
        }
        return head;
    }
    public ListNode addTwoNumbersWithRecursion(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);

        return result;
    }
}



