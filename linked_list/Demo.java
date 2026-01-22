
import java.util.Stack;

import java.util.*;
// class Demo{
//     static void flip(Queue<Integer> q){
//         Stack<Integer> s=new Stack<>();
//         int index=0;
//         Queue<Integer> q2=new LinkedList<>();
//         while(!q.isEmpty()){
//             if(index%2!=0) s.push(q.poll());
//             else q2.add(q.poll());
//             index++;
//         }
//         index=0;
//         while(!q2.isEmpty() || !s.isEmpty()){
//             if(index%2==0 && !q2.isEmpty()) q.add(q2.poll());
//             else q.add(s.pop());
//             index++;
//         }

//     }
// }

// public static long howmuchtowait(List<Integer> tickets, int p){
//     long t=0;
//     while(tickets.get(p)!=0){
//         for(int i=0; i<tickets.size(); i++){
//             if(tickets.get(i)!=0) {
//                 tickets.set(i, tickets.get(i)-1);
//                 t++;
//             }
//             if(tickets.get(p)==0) break;
//         }
//     }
//     return t;
// }

// public Node listCot(Node head){
//     if(head==null) return null;
//     Node slow=head;
//     Node fast=head;
//     while(fast.next!=head && fast.next.next!=head){
//         slow=slow.next;
//         fast=fast.next.next;
//     }
//     Node head2=slow.next;
//     slow.next=head;

//     Node t=head2;
//     while(t.next!=head){
//         t=t.next;
//     }
//     t.next=head2;
    
//     return head2;
// }

// public static void checkString(String str){
//     if(str==null || str.length()==0) {
//         System.out.println("Invalid");
//         return;
//     }
//     charc=str.charAt(0);
//     if(!Character.isLetter(c)){
//         System.out.println("Invalid");
//         return;
//     }
//     for(int i=0; i<str.length(); i++){
//         c=str.charAt(i);
//         if(!(Character.isDigit(c) || Character.isLetter(c))){
//             System.out.println("Invalid");
//             return;
//         }
//     }
//     System.out.println("Valid");
//         return;
// }

// static Node copyList(Node org){
//     if(org==null) return null;
//     Node head=new Node(0);
//     Node temp=head;
//     Node th=org;
//     while(th!=null){
//         Node t=new Node(th.data);
//         temp.next=t;
//         temp=t;
//         th=th.next;
//     }
//     temp.next=null;
//     return head.next;
// }

void swapNodes(int x, int y){
    if(x==y) return;
    LinkList curr=head;
    LinkedList nodeX=null, nodeY=null;
    while(curr!=null){
        if(curr.data==x) nodeX=curr;
        else if(curr.data==y) nodeY=curr;
        curr=curr.next;
    }
    if(nodeX==null || NodeY==null) return;
    int temp=nodeX.data;
    nodeX.data=nodeY.data;
    nodeY.data=temp;
}