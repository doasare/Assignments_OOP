// Initiate counter and use increment method
public class TestCounter
    {
        public static void main (String[]args)
        {
                //increment object passing 2 for starting value 
                Counter ctr = new Counter (2);
                
                //test increment
                ctr.increment();
                    // print value
                    System.out.println(ctr.getValue());
                 //reset count to 0
                 ctr.reset();

        }
    }
