// Write a sample command to run a Java program with two command line arguments
// public class First {
//     public static void main(String[] args) {
//         System.err.println(args[0] + " " + args[1]);
//     }
// }

// Suppose you need a Java program that takes three numbers from the command line and prints
// their sum. Show the code and explain what happens if fewer than three arguments are provided
public class First{
    public static void main(String[] args) {
        if(args.length==3)
        {
            System.err.println(Integer.parseInt(args[0])+ Integer.parseInt(args[1])+ Integer.parseInt(args[2]));
        }
        else{
            System.err.println("Incorrect number of arguments");
        }
    }
}