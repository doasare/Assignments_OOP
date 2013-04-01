//Sports car subclass on vehicle
public class SportsCar extends vehicle
{
    // Sports Car attributes
    private double topspeed;
    private double fuel;
    
    //constructor
    public SportsCar(double hs, double w, double tp)
    {
        
        super(hs, 0.5, w);
        this.topspeed = tp;
        
    }
    
    //topspeed
     public double topspeed()
    { 
        
        return this.topspeed;

    }
    // fuel consumption
      public double fuelConsumption()
    {
        fuel=(1000+(this.weight/5))*(this.topspeed/100)*(this.aerodynamics*this.horsepower)/10000;
        return fuel;
    } 
}
    