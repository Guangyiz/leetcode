import java.util.List;

/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // ListNode p =  l1;
        // long add1 = 0;
        // long index = 1;
        // while(p != null) {
        //     add1 = add1 + p.val*index;
        //     index = index*10;
        //     p = p.next;
        // }
        // System.out.println(add1);
        // long add2 = 0;
        // p = l2;
        // index = 1;
        // while(p != null) {
        //     add2 = add2 + p.val*index;
        //     index = index*10;
        //     p = p.next;
        // }
        // System.out.println(add2);
        // long sum = add1 + add2;
        // ListNode result = new ListNode(-1);
        // ListNode q = result;
        // do{
        //     long tmp = sum%10;
        //     sum = sum/10;
        //     ListNode node = new ListNode((int)tmp);
        //     System.out.print(tmp);
        //     q.next = node;
        //     q = node;
        // }while(sum != 0);
        // return result.next;
        int add = 0;
        int val = l1.val + l2.val +add;
        
        if (val >= 10) {
            val = val % 10;
            add = 1;
        }else{
            add = 0;
        }
        ListNode head = new ListNode(val);
        l1 = l1.next;
        l2 = l2.next;
        ListNode p = head;
        while(l1 != null && l2 != null) {
            val = l1.val + l2.val+ add;
            if (val >= 10) {
                val = val % 10;
                add = 1;
            }else{
                add = 0;
            }
            ListNode tmp = new ListNode(val);
            p.next = tmp;
            p = tmp;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            val = l1.val + add;
            if (val >= 10) {
                val = val % 10;
                add = 1;
            }else{
                add = 0;
            }
            ListNode tmp = new ListNode(val);
            p.next = tmp;
            p = tmp;
            l1 = l1.next;
        }
        while(l2 != null) {
            val = l2.val + add;
            if (val >= 10) {
                val = val % 10;
                add = 1;
            }else{
                add = 0;
            }
            ListNode tmp = new ListNode(val);
            p.next = tmp;
            p = tmp;
            l2 = l2.next;
        }
        if(add != 0) {
            ListNode tmp = new ListNode(add);
            p.next = tmp;
            p = tmp;
        }
        return head;
    }
}

