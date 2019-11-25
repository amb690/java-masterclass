package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myResult = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("myResult = " + myResult);
        double remainder = myResult % 40.00d;
        System.out.println("theRemainder = " + remainder);
        boolean remainderIsZero = (remainder == 0) ? true: false;
        System.out.println("Remainder is zero = " + remainderIsZero);
        if (!remainderIsZero) {
            System.out.println("Got some remainder");
        }
    }
}
