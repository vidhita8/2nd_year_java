import java.util.*;
public class Delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+ Arrays.toString(arr));

        System.out.println("Enter the position of the digit you want to delete:");
        int tar=sc.nextInt();

        for(int i=tar; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }

        System.out.println("The final array is: "+ Arrays.toString(arr));
    }
}
