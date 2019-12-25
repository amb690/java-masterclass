package academy.learnprogramming;

public class AirConditioner {

    private String name;
    private int temperature;

    public AirConditioner(String name) {
        this.name = name;
        this.temperature = 25;
    }

    public void turnOn() {
        System.out.println("The air conditioner is on");
    }

    public void turnOff() {
        System.out.println("The air conditioner is off");
    }

    public void warmUp() {
        this.temperature++;
    }

    public void coolDown() {
        if (this.temperature == 0) {
            return;
        }
        this.temperature--;
    }

    public void printTemperature() {
        System.out.println("----------------------Air conditioner-------------------------");
        System.out.println("Name: " + name + ". Temperature: " + temperature + "ºC");
        System.out.println();
    }
}
