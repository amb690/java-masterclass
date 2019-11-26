package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int total = 0;
        int count = 0;
//	    for (int i=1; i<1001; i++) {
//	        if (i%15 == 0) {
//                System.out.println("Found number " + i);
//	            total += i;
//	            count++;
//                if (count == 5) {
//                    break;
//                }
//	        }
//        }

        for (int i = 15; i < 1001; i=i+15) {
            System.out.println("Found number " + i);
            total += i;
            count++;
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum of the numbers divisible by 3 and 5 = " + total);
    }
}
