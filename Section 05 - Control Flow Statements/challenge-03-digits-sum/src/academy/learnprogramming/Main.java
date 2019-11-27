package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits in number 440 is " + sumDigits(440));
        System.out.println("The sum of digits in number 9505 is " + sumDigits(9505));
        System.out.println("The sum of digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of digits in number -1 is " + sumDigits(-1));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        int digit = 0;
        do {
            digit = number % 10;
            sum += digit;
            number /= 10;
        } while (number > 0);
        return sum;
    }
}
