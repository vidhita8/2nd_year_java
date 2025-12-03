import java.util.*;
public class Insert{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+ Arrays.toString(arr));

        System.out.print("Enter The number you want to insert: ");
        int num=sc.nextInt();
        System.out.println("Enter the position at which to insert number: ");
        int pos=sc.nextInt();

        for(int i=arr.length-2; i>=pos; i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=num;
        System.out.println("Final array: "+ Arrays.toString(arr));
        }
    }

