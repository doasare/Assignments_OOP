public class TestAcceleration
{
public static void main(String[] args)  
{
    SportsCar firstcar = new SportsCar(200, 1500, 220);
    SportsCar secondcar = new SportsCar(100, 1000, 170);
    SportsCar thirdcar = new SportsCar(135,1100.2, 173);
    Van lorry= new Van (100,3500,160.4);

    System.out.println("The first car  " + firstcar.acceleration() + " fuel ");
    System.out.println("The second car  " + secondcar.acceleration() + " fuel ");
    System.out.println("The third car  " + thirdcar.acceleration() + " fuel ");
    System.out.println("The Van " + lorry.acceleration() + " fuel ");
    


}

}