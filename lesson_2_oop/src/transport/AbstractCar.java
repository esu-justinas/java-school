package transport;

public abstract class AbstractCar implements Vehicle {

    private int speed;

    public AbstractCar(int speed) {
        this.speed = speed;
    }

    public void drive() {
        System.out.println("we are driving a car");
    }

    public abstract void refuel();

}
