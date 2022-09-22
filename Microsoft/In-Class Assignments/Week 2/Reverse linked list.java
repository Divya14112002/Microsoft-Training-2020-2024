class Solution {
    ListNode result;
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        reverse(head).next = null;
        return result;
    }

    public ListNode reverse(ListNode head) {
        if (head.next == null) {
            result = head;
            return head;
        }
        ListNode head1 = reverse(head.next);
        head1.next = head;
        head1 = head1.next;
        return head1;
    }
}
