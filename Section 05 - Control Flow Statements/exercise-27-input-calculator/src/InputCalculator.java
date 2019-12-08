import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        double sum = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextLong()) {
                long number = sc.nextLong();
                sum += number;
                count++;
            } else {
                break;
            }
        }
        long average = Math.round(sum/count);
        System.out.println("SUM = " + (long) sum + " AVG = " + average);
    }
}
