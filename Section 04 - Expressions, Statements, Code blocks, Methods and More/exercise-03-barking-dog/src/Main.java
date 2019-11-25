public class Main {

    public static void main(String[] args) {
        boolean barking = BarkingDog.shouldWakeUp(true, 7);
        System.out.println(barking);

        barking = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(barking);

        barking = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(barking);

        barking = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(barking);

        barking = BarkingDog.shouldWakeUp(true, 23);
        System.out.println(barking);
    }
}
