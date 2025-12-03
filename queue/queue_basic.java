package queue;

import java.util.*;

public class queue_basic {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q_temp=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        // System.out.println(q);
        // q.remove();
        // System.out.println(q);
        // q.poll();
        // System.out.println(q);
        // System.out.println(q.peek());
        // System.out.println(q.element());
        while(q.size()!=0){
            System.out.print(q.peek() + " ");
            q_temp.add(q.peek());
            q.remove();
        }
        System.out.println();
        while(q_temp.size()>0){
            q.add(q_temp.peek());
            q_temp.remove();
        }
        System.out.println(q);
    }
    
}
