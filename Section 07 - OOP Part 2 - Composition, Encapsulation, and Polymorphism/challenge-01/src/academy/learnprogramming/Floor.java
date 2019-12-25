package academy.learnprogramming;

public class Floor {

    private Dimensions dimensions;
    private String flooring;

    public Floor(Dimensions dimensions, String flooring) {
        this.dimensions = dimensions;
        this.flooring = flooring;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public String getFlooring() {
        return flooring;
    }

    public void setFlooring(String flooring) {
        this.flooring = flooring;
    }

    public void printFloor() {
        System.out.println("----------------------Floor-------------------------");
        System.out.println("Flooring: " + flooring);
        dimensions.printDimensions();
    }
}
