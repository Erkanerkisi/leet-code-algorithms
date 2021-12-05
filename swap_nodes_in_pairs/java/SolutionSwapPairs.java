class SolutionSwapPairs {
    public static void main(String[] args) {
        System.out.println("");
        /*ListNode dort = new ListNode(4);
        ListNode uc = new ListNode(3, dort);
        ListNode iki = new ListNode(2, uc);
        ListNode bir = new ListNode(1, iki);*/
        ListNode uc = new ListNode(3, null);
        ListNode iki = new ListNode(2, uc);
        ListNode bir = new ListNode(1, iki);
        ListNode result = swapPairs(bir);
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(-1, null);
        ListNode last = null;
        int index = 0;
        if(head == null) return null;
        while (head.next != null) {
            if (index % 2 == 0) {
                ListNode first = new ListNode(head.val, null);
                ListNode second = new ListNode(head.next.val, first);
                if (result.next == null) {
                    result.next = second;
                } else {
                    last.next = second;
                }
                last = first;
            }
            head = head.next;
            index++;
        }
        if (index % 2 == 0) {
            if (result.next == null) {
                result.next = head;
            } else {
                last.next = head;
            }
        }
        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}