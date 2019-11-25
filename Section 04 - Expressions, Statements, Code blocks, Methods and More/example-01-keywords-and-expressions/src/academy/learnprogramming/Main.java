package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344);
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is a valid expression");
        }

        // In the following code that I will type below, write down what parts of the code
        // are expressions.
        int score = 10;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }

        // Solution
        // int [score = 10];
        // if ([score > 99]) {
        //   System.out.println(["You got the high score!"]);
        //   [score = 0];
        // }
    }
}
