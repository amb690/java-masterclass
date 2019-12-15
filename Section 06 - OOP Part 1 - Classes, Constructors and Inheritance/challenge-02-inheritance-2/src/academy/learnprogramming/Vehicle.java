package academy.learnprogramming;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;
    private int maxSpeed;

    public Vehicle() {
        this("Default name", 0, 0, 0);
    }

    public Vehicle(String name, int currentSpeed, int currentDirection, int maxSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
        this.currentDirection = currentDirection;
        this.maxSpeed = maxSpeed;
        if (maxSpeed < currentSpeed) {
            this.maxSpeed = currentSpeed;
        }
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer() called. Pointing at: " + direction + "º");
    }

    public void move(int direction, int amount) {
        steer(direction);
        System.out.println("Vehicle.move() called" +
                ". Direction: " + this.currentDirection +
                ". Current speed: " + this.currentSpeed +
                ". Amount: " + amount);
    }

    public void accelerate(int amount) {
        if (this.currentSpeed + amount > this.maxSpeed) {
            System.out.println("Trying to accelerate to " + (currentSpeed + amount) + ". Max speed allowed: " + maxSpeed);
            return;
        }
        this.currentSpeed += amount;
        System.out.println("Vehicle.accelerate() called. Speed increase: " + amount + ". Current speed: " + this.currentSpeed);
    }

    public void brake(int amount) {
        if (this.currentSpeed - amount < 0) {
            System.out.println("Current speed: " + this.currentSpeed + ". Brake limit exceeded by " + amount);
            return;
        }
        this.currentSpeed -= amount;
        System.out.println("Vehicle.brake() called. Speed decrease: " + amount + ". Current speed: " + this.currentSpeed);
        if (this.currentSpeed == 0) {
            stop();
        }
    }

    public void stop() {
        System.out.println("Vehicle.stop() called.");
        this.currentSpeed = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
