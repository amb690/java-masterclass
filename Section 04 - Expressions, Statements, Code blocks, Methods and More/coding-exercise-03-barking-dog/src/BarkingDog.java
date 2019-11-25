public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
//        if (hourOfTheDay < 0 || hourOfTheDay > 23) {
//            return false;
//        }
//        return barking && (hourOfTheDay < 8 || hourOfTheDay > 22);

        if (!barking) {
            return false;
        }
        return hourOfTheDay > -1 && hourOfTheDay < 8 || hourOfTheDay == 23;
    }
}
