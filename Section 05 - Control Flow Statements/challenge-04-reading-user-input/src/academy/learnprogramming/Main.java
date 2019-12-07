package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 1, total = 0;
        Scanner sc = new Scanner(System.in);
        while (count < 11) {
            System.out.println("Enter number #" + count + ":");
            if (sc.hasNextInt()) {
                total += sc.nextInt();
                count++;
            } else {
                System.out.println("Invalid number");
            }
            sc.nextLine(); // handle end of line (enter key)
        }
        sc.close();
        System.out.println("Sum of numbers introduced: " + total);
    }
}
