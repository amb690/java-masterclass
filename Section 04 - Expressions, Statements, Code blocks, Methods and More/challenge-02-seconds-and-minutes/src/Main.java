public class Main {

    public static void main(String[] args) {
        System.out.println(SecondsAndMinutesToHours.getDurationString(81, 2));
        System.out.println(SecondsAndMinutesToHours.getDurationString(81, 60));
        System.out.println(SecondsAndMinutesToHours.getDurationString(-1, 50));
        System.out.println(SecondsAndMinutesToHours.getDurationString(124, 5));
        System.out.println(SecondsAndMinutesToHours.getDurationString(61, 0));

        System.out.println(SecondsAndMinutesToHours.getDurationString(-1));
        System.out.println(SecondsAndMinutesToHours.getDurationString(3601));
    }
}
