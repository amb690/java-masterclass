public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer? 46: 36;
        return temperature > 24 && temperature < upperLimit;
    }
}
