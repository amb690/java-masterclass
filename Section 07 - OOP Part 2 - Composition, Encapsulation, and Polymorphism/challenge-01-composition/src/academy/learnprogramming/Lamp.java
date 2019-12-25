package academy.learnprogramming;

public class Lamp {

    private String name;
    private String colour;

    public Lamp(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void printSpecifications() {
        System.out.println("----------------------Lamp-------------------------");
        System.out.println("Name: " + name + ". Colour: " + colour);
        System.out.println();
    }
}
