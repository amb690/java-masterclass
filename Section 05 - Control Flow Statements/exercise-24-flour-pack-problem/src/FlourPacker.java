public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (!(bigCount > -1 && smallCount > -1 && goal > -1)) {
            return false;
        }

        goal -= Math.min(goal/5, bigCount) * 5;
        return goal - smallCount < 1;
    }
}
