public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        StringBuilder word = new StringBuilder();
        int digit;
        int reverseNumber = reverse(number);
        int numberOfZeroes = getDigitCount(number) - getDigitCount(reverseNumber);

        do {
            digit = reverseNumber % 10;
            switch (digit) {
                case 1:
                    word.append("One");
                    break;
                case 2:
                    word.append("Two");
                    break;
                case 3:
                    word.append("Three");
                    break;
                case 4:
                    word.append("Four");
                    break;
                case 5:
                    word.append("Five");
                    break;
                case 6:
                    word.append("Six");
                    break;
                case 7:
                    word.append("Seven");
                    break;
                case 8:
                    word.append("Eight");
                    break;
                case 9:
                    word.append("Nine");
                    break;
                default:
                    word.append("Zero");
            }
            word.append("\n");
            reverseNumber /= 10;
        } while (reverseNumber > 0);

        for (int i=0; i<numberOfZeroes; i++) {
            word.append("Zero\n");
        }
        System.out.println(word);
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        do {
            count++;
            number /= 10;
        } while(number > 0);
        return count;
    }
}
