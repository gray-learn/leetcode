/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1 || head == null){
            return head;
        }
        int count = k;
        ListNode curr = head;
        while(curr != null && count != 0){
            count--;
            curr = curr.next;
        }
        if(count > 0)return head;
        ListNode prev = reverseKGroup(curr, k);
        ListNode currHead = head;
        for(int i = 0; i < k; i++){
            ListNode next = currHead.next;
            currHead.next = prev;
            prev = currHead;
            currHead = next;
        }
        return prev;
    }
}
// @lc code=end

