import java.util.Arrays;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+ Arrays.toString(arr));

        System.out.print("Enter the number you want to remove: ");
        int num=sc.nextInt();

        int[] temp=new int[n];
        int nk=0;

        for(int i=0;i<arr.length; i++){
            if(arr[i]!=num){
                temp[nk]=arr[i];
                nk++;
            }
        }

        int[] result=new int[nk];
        for(int i=0; i<nk;i++){
            result[i]=temp[i];
        }

        System.out.println("Final array is: "+ Arrays.toString(result));
    }
}
