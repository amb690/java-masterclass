package academy.learnprogramming;

public class Car {

    private String name;
    private int wheels;
    private int cylinders;
    private boolean engine;
    private int currentSpeed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = false;
        this.currentSpeed = 0;
    }

    public void startEngine() {
        System.out.println("Car.startEngine() called. Starting engine...");
        this.engine = true;
    }

    public void accelerate(int acceleration) {
        System.out.println("Car.accelerate() called. Current speed: " + this.currentSpeed + "km/h. " +
                "Increasing speed " + acceleration + "km/h.");
        this.currentSpeed += acceleration;
        System.out.println("Current speed: " + this.currentSpeed);
    }

    public void brake(int deceleration) {
        System.out.println("Car.brake() called. Current speed: " + this.currentSpeed + "km/h. " +
                "Decreasing speed " + deceleration + "km/h.");
        if (this.currentSpeed - deceleration < 0) {
            System.out.println("Brake limit reached...");
            return;
        }
        this.currentSpeed -= deceleration;
        System.out.println("Current speed: " + this.currentSpeed);
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isEngine() {
        return engine;
    }
}
