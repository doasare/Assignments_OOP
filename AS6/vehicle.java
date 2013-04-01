//super class
public class vehicle
{
   //class attribles
    protected double horsepower;
    protected double aerodynamics;
    protected double weight;
    double acceleration;
   
    //constructor
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
    
    //accerleration method
    public double acceleration()
    {
        this.acceleration=(100/this.horsepower)*this.aerodynamics*this.weight/100;
        return this.acceleration;
    }
    


    
   
}

 