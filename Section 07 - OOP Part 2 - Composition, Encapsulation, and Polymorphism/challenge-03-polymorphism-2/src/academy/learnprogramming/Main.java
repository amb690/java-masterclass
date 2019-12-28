package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car forgettable = new Forgettable("Forgettable", 5);
        forgettable.startEngine();

        Car ford = new Ford("Ford", 3);
        ford.startEngine();

        Car ferrari = new Ferrari("Ferrari", 10);
        ferrari.startEngine();
    }
}
