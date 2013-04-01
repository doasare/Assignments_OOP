//subclass of vehicle
public class Van extends vehicle
{
    double carryWeight;
    
      public Van(double hs, double w, double cw)
    {
        
        super(hs, 0.9, w);
        this.carryWeight = cw;
        
        
    }
    @Override
    public double acceleration()
    {
        double totalWeight = this.carryWeight + this.weight;
        acceleration=(100/this.horsepower)*this.aerodynamics*totalWeight/100;
        return acceleration;
    }
    
    //carry weight included with van subclasss
         public double carryWeight()
    { 
        
        return this.carryWeight;

    }
    
    
}