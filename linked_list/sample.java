class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null)return null;
        for(int i=1; i<=n; i++){
            fast=fast.next;
        }
        if(fast==null){
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
        }
    }
