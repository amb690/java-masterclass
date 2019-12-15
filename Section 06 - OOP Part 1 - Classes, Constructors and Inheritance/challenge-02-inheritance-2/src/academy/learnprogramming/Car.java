package academy.learnprogramming;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private String type;
    private String engine;
    private String fuel;
    private boolean accelerator;
    private boolean brake;
    private int currentGear;

    public Car(String name, int maxSpeed, int doors, int gears, String type, String engine, String fuel) {
        super(name, 0, 0, maxSpeed);
        this.wheels = 4;
        this.doors = doors;
        this.gears = gears;
        this.type = type;
        this.engine = engine;
        this.fuel = fuel;
        this.accelerator = false;
        this.brake = false;
    }

    @Override
    public void move(int direction, int amount) {
        System.out.println("Car.move() called.");
        if (!accelerator && !brake) {
            stop();
            return;
        }

        if (accelerator && brake) {
            System.out.println("Accelerating and braking not allowed at the same time");
            return;
        }

        super.move(direction, this.getCurrentSpeed());
        if (accelerator) {
            accelerate(amount);
        } else {
            brake(amount);
        }
        changeGear();
    }

    public void changeGear() {
        int increase = getMaxSpeed()/this.gears;
        this.currentGear = this.getCurrentSpeed()/increase;
        System.out.println("Car.changeGear() called. Current gear: " + this.currentGear);
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public String getType() {
        return type;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setAccelerator(boolean accelerator) {
        this.accelerator = accelerator;
    }

    public void setBrake(boolean brake) {
        this.brake = brake;
    }
}
