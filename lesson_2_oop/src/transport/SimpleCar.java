package transport;

public class SimpleCar implements Vehicle {

    private int speed;

    public SimpleCar(int speed) {
        this.speed = speed;
    }

    public void drive() {
        System.out.println("We are driving a simple car");
    }

    public int getSpeed() {
        return this.speed;
    }

}
