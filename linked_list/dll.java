package linked_list;

public class dll {
    public static class Node{
        int val;
        Node prev;
        Node next;
        Node (int val){
            this.val=val;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node insert(Node head,int idx, int value){
        Node add=new Node(value);
        Node temp=head;
        if(idx==0){
            add.next=head;
            head.prev=add;
            head=add;
            return head;
        }
        int i=0;
        while(temp!=null){
            if(i==idx){
                temp.prev.next=add;
                add.next=temp;
                add.prev=temp.prev;
                temp.prev=add;
                break;
            }
            temp=temp.next;
            i++;

        }
        return head;
    }

    public static Node delete(Node head, int idx){
        Node temp=head;
        if(idx==0){
            head=temp.next;
            temp.next.prev=null;
        }
        int i=1;
        while(temp!=null){
            if(i==idx){
                temp.prev.next=temp.next;
                temp.next=temp.prev;
                break;
            }
            temp=temp.next;
            i++;
        }
        return head;

    }
    public static void main(String[] args) {
        
        Node a=new Node(10);
        Node b=new Node(12);
        Node c=new Node(14);
        Node d=new Node(9);
        Node e=new Node(20);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        display(a);
        insert(a,0,10);
        display(a);
        delete(a, 2);
        display(a);
    }
}
