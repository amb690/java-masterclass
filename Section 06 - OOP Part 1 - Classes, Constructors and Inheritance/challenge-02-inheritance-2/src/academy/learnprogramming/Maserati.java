package academy.learnprogramming;

public class Maserati extends Car {

    private boolean rearWing;

    public Maserati(int maxSpeed, boolean rearWing) {
        super("Maserati", maxSpeed,3, 8, "Luxury", "Ferrari F136", "Octane 93");
        this.rearWing = rearWing;
    }

    @Override
    public void move(int direction, int amount) {
        System.out.println("Maserati.move() called");
        super.move(direction, amount);
    }
}
