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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) { // Edge case 1
            return null;
        }
        if (l1 == null) { // Edge case 2
            return l2;
        }
        else if (l2 == null) {  // Edge case 3
            return l1;
        }
        ListNode head;
        ListNode first = l1;
        ListNode second = l2;
        if (first.val < second.val) {
            head = new ListNode(first.val);
            first = first.next;
        }
        else {
            head = new ListNode(second.val);
            second = second.next;
        }
        ListNode curr = head;
        while (first != null && second != null) {
            if (first.val < second.val) {
                curr.next = first;
                first = first.next;
            }
            else {
                curr.next = second;
                second = second.next;
            }
            curr = curr.next;
        }
        if (first != null) {
            curr.next = first;
        }
        if (second != null) {
            curr.next = second;
        }
        return head;
    }
}
