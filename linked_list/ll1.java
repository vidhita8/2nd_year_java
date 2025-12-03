package linked_list;

public class ll1 {

    public static void displayr(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        displayr(head.next);
    }

    public static void display_reverse(Node head){
        if(head == null) return;
        display_reverse(head.next);
        System.out.print(head.data + " ");
    }

    public static int length(Node temp){
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void display(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;

        displayr(a);
        System.out.println();

        display(a);
        System.out.println();

        display_reverse(a);
        System.out.println();

        System.out.println("Length of list: " + length(a));
    }
}
