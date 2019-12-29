package academy.learnprogramming;

public class Addition {

    private String name;
    private double price;
    private boolean selected;

    public Addition(String name, double price) {
        this.name = name;

        if (price > .0) {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
