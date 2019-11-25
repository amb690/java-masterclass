public class TeenNumberChecker {

    public static boolean hasTeen (int firstValue, int secondValue, int thirdValue) {
        return isTeen(firstValue) || isTeen(secondValue) || isTeen(thirdValue);
    }

    public static boolean isTeen (int value) {
        return value > 12 && value < 20;
    }
}
