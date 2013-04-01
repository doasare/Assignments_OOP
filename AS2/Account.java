import java.lang.Math;
//Account Object
public class Account
{
    //private variables
    private double balance;
    private double interestRate;

    /**
     * Constructor for objects of class Account
     */
    //constructor method
    public Account(double initialBalance)
    {
       // pass value into balance
       this.balance = initialBalance;
        
    }

   // pass amount to deposit into balance
    public void deposit(double amount)
    {
        this.balance += amount; 
    }
   
    // pass amount to deduct from balance
    public void withdraw(double amount)
    {
        this.balance -= amount;
    }
   
    // return value of balance
    public double getBalance()
    {
        return this.balance;
    }
    
    //set InterestRate
    public void setInterestRate(double rate)
    {
        this.interestRate = rate;
    }
    
    // 
    public int computeInterest(int n)
    {
         double newBalance = balance*Math.pow(1+this.interestRate,n/12);
         int a = (int)newBalance;
         return a;
    }
}
