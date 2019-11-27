public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int firstValue, int secondValue) {
        if (firstValue < 10 || secondValue < 10) {
            return -1;
        }

        int divisor = Math.min(firstValue, secondValue);
        while (firstValue % divisor != 0 || secondValue % divisor != 0) {
            divisor--;
        }
        return divisor;
    }
}
