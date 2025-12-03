package queue;

public class cs_imp {
    public static class circular_queue{
        int[] arr=new int[5];
        int f=-1;
        int r=-1;
        int size=0;

        public void add(int val){
            if(size==arr.length){
                System.out.println("Queue is full");
                return;
            }
            if(size==0){
                f=r=0;
                arr[0]=val;
            }
            else {
                r=(r+1)%arr.length;
                arr[r]=val;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int val=arr[f];
            f=(f+1)%arr.length;
            size--;
            if(size==0){
                f=r=-1;
            }
            return val;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                return arr[f];
            }
        }

        public void display(){
            int i=f;
            for(int j=0; j<size; j++){
                System.out.print(arr[i]+ " ");
                i=(i+1)%arr.length;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            circular_queue q=new circular_queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.display();
            System.out.println(q.remove());
            q.display();
            System.out.println(q.peek());
            q.remove();
            q.display();
            q.add(6);
            q.add(7);
            q.display();
            q.
        }
    }
}
    
