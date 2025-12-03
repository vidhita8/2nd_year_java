package queue;


public class array_imp{
    public static class queueArray{
         private int front=-1;
         private int rare=-1;
         int size=0;
         int[] arr=new int[100];
         public void add(int val){
            if(rare==arr.length-1) {
                System.out.println("Queue is full!");
                return;
            }
            if(front==-1) front=rare=0;
            else rare++;
            arr[rare]=val;
            size++;
         }

         public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            front++;
            size--;
            return arr[front-1];
         }

         public int peek(){
            if(size==0){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
         }
         public void display(){
            if(size==0){
                System.out.println("Empty queue");
                return;
            }
            int temp=front;
            for(int i=front; i<=rare; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
         }
         public int size(){
            return size;
         }
    }
    public static void main(String[] args) {
        queueArray q=new queueArray();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
