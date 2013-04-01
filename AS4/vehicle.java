// Vehicle Object
public class vehicle
{
    protected double horsepower;
    protected double aerodynamics;
    protected double weight;
    double acceleration;
   
    
    public vehicle(double hs, double ad, double w)
    {
     this.horsepower=hs;
     this.aerodynamics= ad;
     this.weight=w;
      
     
    }
    
     public double getHorsepower()
    {
        return this.horsepower; 
    }
    
    public double getAerodynamics()
    { 
        return this.aerodynamics;
    }
    
    public double getweight()
    {
        return this.weight;
        
    }


    
   
}

 