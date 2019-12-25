package academy.learnprogramming;

public class Wall {

    private String name;
    private String colour;
    private Dimensions dimensions;

    public Wall(String name, Dimensions dimensions) {
        this.name = name;
        this.colour = "white";
        this.dimensions = dimensions;
    }

    public Wall(String name, String colour, Dimensions dimensions) {
        this.name = name;
        this.colour = colour;
        this.dimensions = dimensions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void getDimensions() {
        this.dimensions.printDimensions();
    }

    public void printWall() {
        System.out.println(this.name + " wall");
        System.out.println("Colour: " + colour);
        this.dimensions.printDimensions();
    }
}
