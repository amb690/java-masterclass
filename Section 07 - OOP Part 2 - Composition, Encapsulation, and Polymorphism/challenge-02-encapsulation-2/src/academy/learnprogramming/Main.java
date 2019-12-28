package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer("My printer", 800, false);
	    printer.info();
	    printer.print(5);
	    printer.addToner(50);
	    printer.addToner(20);
	    printer.addToner(100);
	    printer.print(9);
	    printer.print(8);
    }
}
