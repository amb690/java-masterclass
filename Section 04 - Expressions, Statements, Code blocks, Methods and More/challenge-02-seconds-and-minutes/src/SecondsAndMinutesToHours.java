public class SecondsAndMinutesToHours {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        int totalSeconds = minutes * 60 + seconds;
        int hours = totalSeconds / 3600;
        int remainingMinutes = (totalSeconds % 3600) / 60;
        int remainingSeconds = totalSeconds % 60;

        String hoursString = (hours < 10? "0" + hours: hours) + "h ";
        String minutesString = (remainingMinutes < 10? "0" + remainingMinutes: remainingMinutes) + "m ";
        String secondsString = (remainingSeconds < 10? "0" + remainingSeconds: remainingSeconds) + "s";

        return hoursString + minutesString + secondsString;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
