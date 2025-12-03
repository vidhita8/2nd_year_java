// Write a Java program that finds and prints the largest element in each row of a 2D
// array.
import java.util.*;
public class Largest_in_row {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the dimensions of the matrix : ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] arr=new int[n][m];
        System.out.println("Enter your matrix: ");
        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your entered matrix is: "+ Arrays.deepToString(arr));
        for(int i=0; i<n; i++){
            int max=arr[i][0];
            for(int j=1; j<m; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println(max);
        }
    }
}

