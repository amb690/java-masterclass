package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 100;
        short myShortValue = 255;
        int myIntegerValue = 50;
        long result = 50000L + 10L * (myByteValue + myShortValue + myIntegerValue);
        System.out.println(result);

        short shortTotal = (short) (1000 + 10 *
                (myByteValue + myShortValue + myIntegerValue));
    }
}
