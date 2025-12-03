package linked_list;

    public class implementation{
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
        }
        public static class linked_list{
            Node head=null;
            Node tail=null;
            void insertAtEnd(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=temp;
                }
                else{
                    tail.next=temp;
                } 
                tail=temp;
            }

            void insertAtHead(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=tail=temp;
                }
                else{
                    temp.next=head;
                    head=temp;
                }
            }

            void insertAt(int idx, int val){
                if(idx==size()){
                    insertAtEnd(val);
                    return;
                } 
                else if(idx==0){
                    insertAtHead(val);
                    return;
                }
                Node temp=head;
                for(int i=1; i<=idx-1; i++){
                    temp=temp.next;
                }

                Node t=new Node(val);
                t.next=temp.next;
                temp.next=t;
            }

            int getAt(int idx){
                Node temp=head;
                for(int i=0; i<idx; i++){
                    temp=temp.next;
                }
                return temp.data;
            }

            public static void deleteNthFromENd(Node head, int n){
                Node slow=head;
                Node fast=head;
                for (int i=0; i<=n; i++){
                    fast=fast.next;
                }
                while(fast!=null){
                    slow=slow.next;
                    fast=fast.next;
                }
                slow.next=slow.next.next;
            }

            void deleteAt(int idx){
                if(idx==0){
                    head=head.next;
                    return;
                }
                Node temp=head;
                for(int i=1; i<=idx-1; i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                tail=temp;
            }

            void display(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+ " ");
                    temp=temp.next;
                }
                System.out.println();
            }

            int size(){
                Node temp=head;
                int count=0;
                while(temp!=null){
                    temp=temp.next;
                    count++;
                }
                return count;
            }
        }
        public static void main(String[] args) {
            linked_list ll=new linked_list();
            ll.insertAtEnd(4);
            ll.insertAtEnd(5);
            ll.insertAtEnd(40);
            ll.display();
            System.out.println(ll.size());
            ll.insertAtEnd(90);
            ll.display();
            ll.insertAtHead(12);
            ll.display();
            ll.insertAt(2,1000);
            ll.display();
            System.out.println(ll.getAt(2));
            ll.deleteAt(3);
            ll.display();
            ll.deleteNthFromENd(null, 0);
        }
}
