package recursion;

public class rec1 {
    public static int fib(int n){
        if(n==0 || n==1) return n;
        return fib(n-1)+ fib(n-2);
    }

    public static int subseq(int n){
        if(n==1) return 1;
        return subseq(n-1);
    }
    
}
