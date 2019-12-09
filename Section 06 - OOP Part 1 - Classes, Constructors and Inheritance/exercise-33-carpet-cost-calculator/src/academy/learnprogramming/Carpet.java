package academy.learnprogramming;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = cost < 0? 0: cost;
    }

    public double getCost() {
        return cost;
    }
}
