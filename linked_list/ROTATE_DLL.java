package linked_list;

public class ROTATE_DLL {
    public Node rotate_by_k(Node head, int k){
    if(head==null || k==0) return head;
    
    Node temp=head;
    for(int i=1; i<k; i++){
        temp=temp.next;
    }
    Node new_head=temp;
    new_head.prev=null;
    Node tail=temp.prev;

    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=head;
    head.prev=temp;
    tail.next=null;
    return new_head;
    }
} 
