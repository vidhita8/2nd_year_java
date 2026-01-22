public class Main {

    // Same as LeetCode's ListNode
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Paste your Solution code here (same format as LeetCode)
    class Solution {
    static int reverse(int n){
        int r=0;
        while(n!=0){
            int a=n%10;
            r=r*10+a;
            n=n/10;
        }
        return r;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=l1;
        int n1=0;
        while(temp!=null){
            int v=temp.val;
            n1=n1*10+v;
            temp=temp.next;
        }
        temp=l2;
        int n2=0;
        while(temp!=null){
            int v=temp.val;
            n2=n2*10+v;
            temp=temp.next;
        }
        int n=reverse(n1)+reverse(n2);
        n=reverse(n);
        ListNode head=new ListNode(0);
        temp=head;
        if(n==0) return head;
        while(n!=0){
            int a=n%10;
            n=n/10;
            ListNode t=new ListNode(a);
            temp.next=t;
            temp=t;
        }
        return head.next;
    }
}
    // Helper method to create a linked list from array
    private static ListNode makeList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper method to print linked list
    private static void printList(ListNode node) {
        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = makeList(new int[]{2,4,3});
        ListNode l2 = makeList(new int[]{5,6,4});

        ListNode result = sol.addTwoNumbers(l1, l2);
        printList(result);
    }
}
