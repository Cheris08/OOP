
public class Main {
    
    public static void main(String[] args)
    {
        Car car = new Car();
        car.go();
        
        Bicycle bike = new Bicycle();
        
        car.go();
        bike.stop();
        
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
