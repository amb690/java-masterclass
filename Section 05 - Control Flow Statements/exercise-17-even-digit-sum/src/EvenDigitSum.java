public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int digit, sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum += digit % 2 == 0? digit: 0;
            number /= 10;
        }
        return sum;
    }
}
