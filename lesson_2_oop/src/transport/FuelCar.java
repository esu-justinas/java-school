package transport;

public class FuelCar extends AbstractCar {

    public FuelCar(int speed) {
        super(speed);
    }

    public void refuel() {
        System.out.println("Filling up with gasoline");
    }
}
