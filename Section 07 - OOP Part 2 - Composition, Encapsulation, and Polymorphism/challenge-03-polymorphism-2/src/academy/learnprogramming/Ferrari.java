package academy.learnprogramming;

public class Ferrari extends Car {

    private boolean wing;
    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
        this.wing = true;
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari.startEngine() called");
    }
}
