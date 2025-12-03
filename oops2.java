// Description: Create a Calculator class with overloaded methods:
// ● add(int a, int b) adds two integers
// ● add(double a, double b) adds two doubles
// ● add(int a, int b, int c) adds three integers
// ● add(String a, String b) concatenates two strings
// ● Demonstrate all methods in main
// Expected Output:
// Integer Addition: 15
// Double Addition: 7.7
// Three Number Addition: 18
// String Concatenation: HelloWorld

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    String add(String a, String b){
        return a+b;
    }
}
public class oops2{
    public static void main(String[] args) {

        Calculator cal=new Calculator();
        System.out.println("Integer Addition: "+ cal.add(3, 8));
        System.out.println("Double Addition: "+ cal.add(3.4, 7.8));
        System.out.println("Three Number Addition: "+ cal.add(3, 4, 5));
        System.out.println("String Concatenation: "+ cal.add("8", "9"));
    }
}