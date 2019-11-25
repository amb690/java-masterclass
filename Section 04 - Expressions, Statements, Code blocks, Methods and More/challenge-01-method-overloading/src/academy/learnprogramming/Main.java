package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimetres(13, 1);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimetres(157);

    }

    // **************************************************************************
    //                              Calculate score
    // **************************************************************************

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    // **************************************************************************
    //                      Feet and inches to centimetres
    // **************************************************************************

//    public static int calcFeetAndInchesToCentimetres(double feet, double inches) {
//        return feet < 0d || (inches < 0d && inches > 12d) ? -1 : (int) ((feet*12d + inches) * 2.54d);
//    }
//
//    public static int calcFeetAndInchesToCentimetres(double inches) {
//        return inches < 0d ? -1 : calcFeetAndInchesToCentimetres(inches/12d, inches % 12d);
//    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        double centimetres = -1d;
        String message = "Invalid feet or inches parameters";
        if (inches > -1d && inches < 13d && feet > -1d) {
            centimetres = (feet*12d + inches) * 2.54d;
            message = feet + " feet, " + inches + " inches = " + centimetres + " cm";
        }
        System.out.println(message);
        return centimetres;
    }

    public static double calcFeetAndInchesToCentimetres(double inches) {
        if (inches < 0d) {
            return -1d;
        }

        double feet = (int) inches/12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimetres(feet, remainingInches);
    }
}
