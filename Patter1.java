// I N T E L L I J
// N T E L L I J
// T E L L I J
// E L L I J
// L L I J
// L I J
// I J
// J
import java.util.*;
public class Patter1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        for(int i=0; i<n.length(); i++){
            for(int j=i; j<n.length(); j++){
                System.out.print(n.charAt(j)+ " ");
            }
            System.out.println();
        }
    }
}
