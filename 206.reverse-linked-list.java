/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // global variable
    ListNode newHead = null;

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        return reverse(head, null); // head, newHead
    }
    private ListNode reverse(ListNode head, ListNode newHead){
        if(head == null){
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;
        return reverse(next, head);
    }
    // TC O(n) SC:O(n)

    // // iterative
    // public ListNode reverseList(ListNode head) {
    //     if(head==null || head.next == null)
    //         return head;
    //     ListNode curr = head;
    //     ListNode prev = null;
    //     while(curr != null){
    //         ListNode tmp = curr.next;
    //         // p c t
    //         curr.next = prev; // c t p
    //         prev = curr; // c t p 
    //         curr = tmp; // t c p
    //     }
    //     return prev;
    // }
    // // TC O(n) SC O(1)

    // recursive
    // public ListNode reverseList(ListNode head) {
    //     if(head==null || head.next == null)
    //         return head;
    //     reverse(head);
    //     return newHead;
    // }
    // private ListNode reverse(ListNode head){
    //     if(head.next == null){
    //         newHead = head;
    //         return head;
    //     }
    //     ListNode tmp = reverse(head.next);
    //     tmp.next = head;
    //     head.next = null;
    //     return head;
    // }
    // 1 > 2 > 3 >4
    // null <1 <2<3<4


    // O(n)



}
// @lc code=end

