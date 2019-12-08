package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number:");
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number <= min) {
                    min = number;
                }
                if (number >= max) {
                    max = number;
                }
            } else {
                break;
            }
            sc.nextLine(); // handle input
        }
        sc.close();
        System.out.println("Minimum value: " + min);
        System.out.println(" Maximum value: " + max);
    }
}
