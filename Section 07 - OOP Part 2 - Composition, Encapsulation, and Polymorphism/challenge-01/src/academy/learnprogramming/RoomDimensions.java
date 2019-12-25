package academy.learnprogramming;

public class RoomDimensions extends Dimensions {

    private int length;

    public RoomDimensions(int height, int width, int length) {
        super(height, width);
        this.length = length;
    }

    public int getLateralArea() {
        return 4 * getArea();
    }

    public int getVolume() {
        return getArea() * length;
    }

    @Override
    public void printDimensions() {
        System.out.println("----------------------Room dimensions----------------------------");
        System.out.println("Length: " + length + " ft. Lateral Area: " + getLateralArea() + ". Volume: " + getVolume());
        System.out.println();
    }
}
