package academy.learnprogramming;

public class Point {

    private int x, y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        double distance = Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2);
        return Math.sqrt(distance);
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
