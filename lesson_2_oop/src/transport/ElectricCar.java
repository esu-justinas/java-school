package transport;

public class ElectricCar extends AbstractCar {

    public static int numberOfWheels = 4;

    private int batteryPercentage;

    public ElectricCar(int speed) {
        super(speed);
    }

    public void refuel() {
        System.out.println("Charging battery");
    }

}
