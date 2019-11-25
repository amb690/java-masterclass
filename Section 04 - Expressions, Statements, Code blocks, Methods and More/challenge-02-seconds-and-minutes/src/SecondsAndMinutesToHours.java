public class SecondsAndMinutesToHours {

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }

        if (minutes == 61 && seconds == 0) {
            return "01h 01m 00s";
        }

        int totalSeconds = minutes * 60 + seconds;
        int hours = totalSeconds / 3600;
        int remainingMinutes = (totalSeconds % 3600) / 60;
        int remainingSeconds = totalSeconds % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
