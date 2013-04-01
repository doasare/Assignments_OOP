public class TestConsumption
{
    public static void main(String[] args)  
    {
        // create car object and attributes
        SportsCar firstcar = new SportsCar(200, 1500, 220);
        SportsCar secondcar = new SportsCar(100, 100, 170);
        SportsCar thirdcar = new SportsCar(135,1100.2, 173);
        
        //calculates consumption and prints
        System.out.println("The first car consumes " + firstcar.fuelConsumption() + " fuel ");
        System.out.println("The second car consumes " + secondcar.fuelConsumption() + " fuel ");
        System.out.println("The third car consumes " + thirdcar.fuelConsumption() + " fuel ");
        
    
    
    }

}