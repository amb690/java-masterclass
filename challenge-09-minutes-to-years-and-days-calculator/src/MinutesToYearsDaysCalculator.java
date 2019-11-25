public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0L) {
            System.out.println("Invalid Value");
            return;
        }

        long days = minutes/1440L;
        long years = days/365L;
        long remainingDays = days % 365L;

        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
}
