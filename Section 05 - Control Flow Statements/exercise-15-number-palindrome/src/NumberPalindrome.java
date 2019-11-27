public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int copyNumber = number;
        int digit = 0;
        while (number != 0) {
            digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
        }
        return reverse == copyNumber;
    }
}
