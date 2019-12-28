package academy.learnprogramming;

public class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford.startEngine() called.");
    }
}
