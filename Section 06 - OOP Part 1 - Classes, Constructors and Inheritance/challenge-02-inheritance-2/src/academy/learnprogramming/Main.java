package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Vehicle vehicle = new Vehicle("My vehicle", 50, 20, 10);
        System.out.println("Vehicle name: " + vehicle.getName());
        System.out.println("Vehicle direction: " + vehicle.getCurrentDirection());
        System.out.println("Vehicle current speed: " + vehicle.getCurrentSpeed());
        System.out.println("Vehicle max speed: " + vehicle.getMaxSpeed());

        System.out.println("-----------------------------------------------------------");

        Car car = new Car("Land Rover", 50,5, 6, "Off road capable", "16P", "Diesel");
        System.out.println("Car name: " + car.getName());
        System.out.println("Car number of gears: " + car.getGears());
        System.out.println("Car max speed: " + car.getMaxSpeed());
        car.setAccelerator(true);
        car.setBrake(false);
        car.move(5, 10);
        car.move(5, 20);
        car.move(5, 20);

        System.out.println("-----------------------------------------------------------");

        Maserati maserati = new Maserati(273,true);
        System.out.println("Car name: " + maserati.getName());
        maserati.setAccelerator(true);
        maserati.move(4, 274);
        maserati.move(6, 100);
        maserati.move(6, 50);
        maserati.setAccelerator(false);
        maserati.setBrake(true);
        maserati.move(10, 150);
    }
}
