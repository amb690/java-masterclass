package academy.learnprogramming;

public class Wall {

    private double width, height;

    public Wall() {}

    public Wall(double width, double height) {
        this.width = width < 0? 0: width;
        this.height = height < 0? 0: height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
            return;
        }
        this.height = height;
    }
}
