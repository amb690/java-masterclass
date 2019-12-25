package academy.learnprogramming;

public class Room {

    private String name;
    private RoomDimensions dimensions;
    private Wall north;
    private Wall south;
    private Wall east;
    private Wall west;
    private Wall ceiling;
    private Floor floor;
    private Lamp lamp;
    private AirConditioner airConditioner;

    public Room(String name) {
        this.name = name;
        this.dimensions = new RoomDimensions(20, 15, 8);
        this.north = new Wall("North", "purple", new Dimensions(40, 40));
        this.south = new Wall("South", "blue", new Dimensions(20, 30));
        this.east = new Wall("East", "blue", new Dimensions(10, 30));
        this.west = new Wall("West", "blue", new Dimensions(20, 40));
        this.ceiling = new Wall("Ceiling", new Dimensions(20, 40));
        this.floor = new Floor(new Dimensions(20, 15), "bamboo");
        this.lamp = new Lamp("Lamp 1", "white");
        this.airConditioner = new AirConditioner("Air conditioner 1");
    }

    public void printRoom() {
        System.out.println(this.name + "\n");
        System.out.println("----------------------Walls----------------------------");
        this.north.printWall();
        this.south.printWall();
        this.east.printWall();
        this.west.printWall();
        this.ceiling.printWall();

        this.floor.printFloor();

        this.dimensions.printDimensions();

        this.lamp.printSpecifications();

        this.airConditioner.printTemperature();
    }
}
