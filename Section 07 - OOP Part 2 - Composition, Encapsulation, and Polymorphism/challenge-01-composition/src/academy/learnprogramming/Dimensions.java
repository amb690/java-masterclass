package academy.learnprogramming;

public class Dimensions {

    private int height;
    private int width;

    public Dimensions(int height, int width) {
        if (width < 0) {
            width = 0;
        }

        if (height < 0) {
            height = 0;
        }

        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return height * width;
    }

    public void printDimensions() {
        System.out.println("Width: " + width + " ft. Height: " + height + " ft. Area: " + getArea());
        System.out.println();
    }
}
