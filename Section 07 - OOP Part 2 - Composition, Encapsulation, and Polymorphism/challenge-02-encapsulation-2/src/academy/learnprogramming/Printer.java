package academy.learnprogramming;

public class Printer {

    private String name;
    private int tonerLevel;
    private boolean duplex;

    public Printer () {
        this.name = "Default printer";
        this.tonerLevel = 0;
        this.duplex = false;
    }

    public Printer(String name, int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel < 101) {
            this.tonerLevel = tonerLevel;
        }

        this.name = name;
        this.duplex = duplex;
    }

    public void addToner(int tonerAmount) {
        System.out.println("The current toner level is " + this.tonerLevel + "%");
        System.out.println("Trying to add " + tonerAmount + "%");
        if (this.tonerLevel + tonerAmount > 100) {
            System.out.println("Unable to add more toner.");
            System.out.println();
            return;
        }
        this.tonerLevel += tonerAmount;
        System.out.println("Toner added. Current level is " + this.tonerLevel + "%\n");
    }

    public void print(int pages) {
        System.out.println("Sending " + pages + " pages to print.");
        if (pages < 0) {
            System.out.println("ERROR: number of pages is less than zero\n");
            return;
        }
        if (tonerLevel == 0) {
            System.out.println("The toner cartridge is empty.\n");
            return;
        }
        if (duplex) {
            pages = pages % 2 == 1? pages + 1: pages;
            pages /= 2;
        }
        System.out.println(pages + " pages printed.\n");
    }

    public void info() {
        System.out.println("---------------------------------");
        System.out.println("Printer name: " + this.name);
        System.out.println("Toner level: " + this.tonerLevel);

        System.out.print("Mode: ");
        if (duplex) {
            System.out.println("duplex");
        } else {
            System.out.println("simplex");
        }
        System.out.println("---------------------------------");
    }

    public String getName() {
        return name;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
