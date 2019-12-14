package academy.learnprogramming;

public class Printer {
    private String name;
    private int tonerLevel;
    private int pages;
    private boolean duplex;

    public Printer(String name, int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.name = name;
        this.duplex = duplex;
        this.pages = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                System.out.println("Toner level: " + this.tonerLevel + " Maximum level reached");
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pages += pagesToPrint;
        return pagesToPrint;
    }

    public String getName() {
        return name;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPages() {
        return pages;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
