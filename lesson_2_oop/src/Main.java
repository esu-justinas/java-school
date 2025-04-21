import shape.Square;
import transport.AbstractCar;
import transport.ElectricCar;
import transport.SimpleCar;
import transport.Vehicle;

public class Main {

    public static void main(String[] args) {
        Square square1 = new Square(3);
        Square square2 = new Square();
        System.out.println("Square1 edge length: " + square1.getEdgeLength());
        System.out.println("Square2 edge length: " + square2.getEdgeLength());

        Vehicle simpleCar = new SimpleCar(20);
        System.out.println("Because we defined SimpleCar as Vehicle, we can only access methods from Vehicle interface:");
        simpleCar.drive();
        System.out.println("We cannot access simpleCar.getSpeed(), because that is not a part of Vehicle interface.");
        System.out.println("In order to access simpleCar.getSpeed(), we need to cast this object to appropriate class");
        System.out.println("This is simpleCar speed: " + ((SimpleCar) simpleCar).getSpeed());

        AbstractCar electricCar = new ElectricCar(500);
        electricCar.drive();
        electricCar.refuel();

        System.out.println(ElectricCar.numberOfWheels);
    }
}