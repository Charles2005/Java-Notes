package ExampleOfClasses;

public class BankAccount {
    // Fields
    private String accNum;
    private int balance;
    private String name;
    private String email;
    private String phoneNum;
    // Constructors
    public BankAccount(String accNum, int balance, String name, String email, String phoneNum){
        this.accNum = accNum;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }
    // Method
    public void deposit(int depositAmnt){
        this.balance += depositAmnt;
        System.out.println("You deposit " + depositAmnt + " is successful.");
    }
    //Method
    public void withdraw(int withdrawAmnt){
        if(this.balance - withdrawAmnt < 0){
            System.out.println("Only " + this.balance + " are remaining. Withdrawal is unsuccessful.");

        }else {
            this.balance -= withdrawAmnt;
            System.out.println("You have successfully withdrawn. Your remaining balance is " + this.balance);
        }
    }
}
