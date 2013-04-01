//Van Class subclass of Vehicle
public class Van extends vehicle
{
    //Van attributes included
    private double carryWeight;
    
    //constructor
      public Van(double hs, double w, double cw)
    {
        
        super(hs, 0.9, w);
        this.carryWeight = cw;
        
        
    }
    
    //overribe accelation method with custom
    @Override
    public double acceleration()
    {
        // carry weight should be added to equation
        double totalWeight = this.carryWeight + this.weight;
        acceleration=(100/this.horsepower)*this.aerodynamics*totalWeight/100;
        return acceleration;
    }
    
    // return carryweight
    public double carryWeight()
    { 
        
        return this.carryWeight;

    }
    
    
}