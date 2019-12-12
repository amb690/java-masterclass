package academy.learnprogramming;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid (double width, double length, double heigth) {
        super(width, length);
        this.height = heigth < 0? 0: heigth;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }
}
