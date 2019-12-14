package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer("Printer1", 50,  false);
		System.out.println("Initial page count = " + printer.getPages());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPages());
		pagesPrinted = printer.printPages(7);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPages());
    }
}
