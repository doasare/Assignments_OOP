// Sub-class of Vehicle Object
public class SportsCar extends vehicle
{
    
    private double topspeed;
    private double fuel;
    
    //constructor method
    public SportsCar(double hs, double w, double tp)
    {
        //inherits super-class
        super(hs, 0.5, w);
        topspeed = tp;
        
    }
    
    public double topspeed()
    { 
        return topspeed;
    }
    
    public double fuelConsumption()
    {
        fuel=(1000+(weight/5))*(topspeed/100)*(aerodynamics*horsepower)/10000;
        return fuel;
    } 
}
    