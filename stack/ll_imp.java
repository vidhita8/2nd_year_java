package stack;

public class ll_imp {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class llStack{
        private Node head=null;
        private int size=0;

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            Node temp=head;
            head=head.next;
            return temp.val;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
            if (size==0) return true;
            return false;

        }

        public static void main(String[] args) {
            llStack st=new llStack();
            st.push(4);
            st.display();
            st.push(3);
            st.display();
            st.push(6);
            st.display();
            st.push(5);
            st.display();
            System.out.println(st.size());
            st.pop();
            st.display();
            System.out.println(st.size());
            System.out.println(st.peek());
            st.push(90);
            System.out.println(st.size());
            st.display();

        }
    }
    
}
