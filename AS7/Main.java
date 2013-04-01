public class Main
{
    public static void main(String[] args)  
    {
        ReadPopulation ctr = new ReadPopulation(5000000);
        
        if (ctr.read()==1)
            System.out.println("There are "+ctr.read()+ " city with a population greater or equal than "+ctr.getTarget());
        else 
            System.out.println("There are "+ctr.read()+ " cities with a population greater or equal than "+ctr.getTarget());
          
        
      
        
    
    
    }

}