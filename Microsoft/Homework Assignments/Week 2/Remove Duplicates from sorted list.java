class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        else{
            if(head.val==head.next.val){
                head.next=head.next.next;
                deleteDuplicates(head);
            }
            else{
                deleteDuplicates(head.next);
            }
        }
        return  head;
    }
    
}
