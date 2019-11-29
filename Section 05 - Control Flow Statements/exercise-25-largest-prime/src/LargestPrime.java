public class LargestPrime {

    public static int getLargestPrime (int number) {
        if (number < 1) {
            return -1;
        }

        boolean isPrime = false;
        while (!isPrime) {
            isPrime = true;
            for (int i = 2; i < number/2 + 1; i++) {
                if (number % i != 0) {
                    continue;
                }
                number /= i;
                isPrime = false;
                break;
            }
        }

        return number;
    }
}