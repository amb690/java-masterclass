public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0, remainder;
        for (int i=1; i<number/2+1; i++) {
            remainder = number % i;
            sum += remainder == 0? i: 0;
        }
        return number == sum;
    }
}
