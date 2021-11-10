/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode aCurr = headA;
        ListNode bCurr = headB;
        while (aCurr != null) {
            set.add(aCurr);
            aCurr = aCurr.next;
        }
        while (bCurr != null) {
            if (set.contains(bCurr)) {
                return bCurr;
            }
            bCurr = bCurr.next;
        }
        return null;
    }
}
