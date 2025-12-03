// 1. Basics & Control Statements
// Print sum of digits of a number (loop + arithmetic operators).
// public class Control {
//     public static void main(String[] args){
//         int n = 1234;
//         String ns = Integer.toString(n);
//         int sum = 0;
//         for(int i = 0; i < ns.length(); i++){
//             sum += ns.charAt(i) - '0';  // Convert char digit to int
//         }
//         System.out.println(sum);
//     }
// }
//Check whether a number is prime or not.
// public class Control{
//     public static void main(String[] args){
//         int n=789, k=0;
//         for(int i=2; i<n; i++){
//             if(n%i==0){
//                 k++;
//             }
//         }
//         if(k==0)
//         System.out.println("Prime");
//         else
//         System.out.println("Not Prime");
//     }
// }

// Find GCD and LCM of two numbers.

// Reverse a number (123 → 321)
// public class Control{
//     public static void main(String[] args){
//         int n=123, rev=0;
//         while(n!=0){
//             int k=n%10;
//             rev=rev*10+k;
//             n/=10;
//         }
//         System.out.println(rev);
//     }
// }

// Check if a number is palindrome (121 → Yes).

// Check Armstrong number (153 = 1³+5³+3³).
// public class Control{
//     public static void main(String[] args){
//         int n=123, sum=0, temp=n;
//         String s=Integer.toString(n);
//         int l=s.length();
//         while(n!=0){
//             int k=n%10;
//             sum+=(int)Math.pow(k,l);
//             n/=10;
//         }
//         if(sum==temp)
//         System.out.println("Armstrong");
//         else
//         System.out.println("Not Armstrong");
//     }
// }

public class Control {
    public static void main(String[] args) {
        int n = 153, sum = 0, temp = n;

        String s = Integer.toString(n);
        int l = s.length(); // number of digits

        while (n != 0) {
            int k = n % 10;
            sum += (int)Math.pow(k, l); // cast the result to int
            n /= 10;
        }

        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
