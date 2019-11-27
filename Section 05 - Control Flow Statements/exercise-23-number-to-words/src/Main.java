public class Main {

    public static void main(String[] args) {
        System.out.println("Number of digits in value 0: " + NumberToWords.getDigitCount(0));
        System.out.println("Number of digits in value 123: " + NumberToWords.getDigitCount(123));
        System.out.println("Number of digits in value -12: " + NumberToWords.getDigitCount(-12));
        System.out.println("Number of digits in value 5200: " + NumberToWords.getDigitCount(5200));

        System.out.println("Reverse of -321 is: " + NumberToWords.reverse(-321));
        System.out.println("Reverse of 1212 is: " + NumberToWords.reverse(1212));
        System.out.println("Reverse of 1234 is: " + NumberToWords.reverse(1234));
        System.out.println("Reverse of 100 is: " + NumberToWords.reverse(100));

        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
        NumberToWords.numberToWords(5);
        NumberToWords.numberToWords(674);
        NumberToWords.numberToWords(0);
    }
}
