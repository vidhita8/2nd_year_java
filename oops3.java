// Problem 3: Bank Account Management
// Description: Create a BankAccount class with:
// ● Private variables: accountNumber, accountHolder, balance
// ● Static variable: totalAccounts
// ● Constructors: default, parameterized, and copy constructor
// ● Methods: deposit(amount), withdraw(amount), displayBalance()
// ● Ensure proper access control and use this keyword
// Expected Output:
// Total Accounts: 2
// Account 1001: John Balance: $1500.0
// Account 1002: Alice Balance: $2500.0
// After deposit in John's account: $1700.0
// After withdrawal from Alice's account: $2000.0

class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;
    static int totalAccounts;

    public BankAccount() {
        accountNumber=0;
        accountHolder="Unknown";
        balance=0.0;
    }
    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
        totalAccounts++;
    }
    public BankAccount(BankAccount oth){
        this.accountNumber=oth.accountNumber;
        this.accountHolder=oth.accountHolder;
        this.balance=oth.balance;
        totalAccounts++;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("After deposit in "+ this.accountHolder + "'s account: $"+ this.balance);
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("After withdrawal from "+ this.accountHolder + "'s account: $"+ this.balance);  
        }      
        else
        System.out.println("Insufficiant balance or invalid amount");
    }
    public void displayBalance(){
        System.out.println("Account " + this.accountNumber +": " + this.accountHolder + " Balance: $" + this.balance);
    }
}
public class oops3{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        BankAccount b2=new BankAccount(1009,"Vidhita", 8000.0);
        BankAccount b3=new BankAccount(1010, "Sumi", 3000.90);
        b1.displayBalance();
        b2.displayBalance();
        b3.displayBalance();
        b2.deposit(2000);
        b3.deposit(9000);
        b2.withdraw(9000);
        b3.withdraw(8000);
    }
}

    
