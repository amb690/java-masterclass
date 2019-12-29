package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Burger burger = new HealthyBurger("Healthy", "Beef", 4.5);

	    if (burger.isExtraAdditions()) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                burger.printExtraAdditions();
                System.out.println("Choose your ingredients (Type 0 to exit): ");
                boolean hasNextInt = sc.hasNextInt();
                if (hasNextInt) {
                    int selected = sc.nextInt();
                    if (selected == 0) {
                        break;
                    }
                    burger.selectIngredient(selected);
                }
            }
        }

	    burger.checkBill();
    }
}
