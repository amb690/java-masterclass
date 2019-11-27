public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstValue, int secondValue, int thirdValue) {
        if (!isValid(firstValue) || !isValid(secondValue) || !isValid(thirdValue)) {
            return false;
        }

        int firstValueLastDigit = firstValue % 10;
        int secondValueLastDigit = secondValue % 10;
        int thirdValueLastDigit = thirdValue % 10;
        return firstValueLastDigit == secondValueLastDigit ||
                secondValueLastDigit == thirdValueLastDigit || firstValueLastDigit == thirdValueLastDigit;
    }

    public static boolean isValid(int number) {
        return number > 9 && number < 1001;
    }
}
