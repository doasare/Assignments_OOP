public class TestAccountInterest
{
   public static void main(String[] args)
   {
       // set balance of account
       Account acc2 = new Account(1000);
       
       // set interest rate percentage
       acc2.setInterestRate(0.1);
       
       // how many month you want to compute interest 36/12 = 3 years interest
       int months = 36;
       int a = acc2.computeInterest(months);
       
       // result for interest over given time and rate.
       System.out.println("Total Interest after "+months/12+"years:  £" + (a - 1000));
       System.out.println("Balance :  £" + a);
    
    }
}
