package academy.learnprogramming;

public class Burger {

    private String name;
    private String bread;
    private String meat;
    private double price;
    private double totalPrice;
    private boolean extraAdditions;

    // Extra additions
    private Addition tomato;
    private Addition lettuce;
    private Addition onion;
    private Addition carrot;

    public Burger(String name, String bread, String meat, double price) {
        this(name, bread, meat, false, price);
    }

    public Burger(String name, String bread, String meat, boolean extraAdditions, double price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.totalPrice = this.price;
        this.tomato = new Addition("Tomato", 0.1);
        this.lettuce = new Addition("Lettuce", 0.3);
        this.onion = new Addition("Onion", 0.4);
        this.carrot = new Addition("Carrot", 0.6);
        this.extraAdditions = extraAdditions;
    }

    public void selectIngredient(int selected) {
        if (!extraAdditions) {
            System.out.println("This burger has no extra additions.");
            return;
        }
        switch (selected) {
            case 1:
                addIngredient(this.tomato);
                break;
            case 2:
                addIngredient(this.lettuce);
                break;
            case 3:
                addIngredient(this.onion);
                break;
            case 4:
                addIngredient(this.carrot);
                break;
        }
    }

    public void addIngredient(Addition addition) {
        addition.setSelected(true);
        this.totalPrice += addition.getPrice();
    }

    public void checkBill() {
        System.out.println("---------------Bill info-----------------");
        System.out.println(this.name + " burger-------------------------" + price + " €");
        System.out.println("Type of bread: " + this.bread + ". Type of meat: " + this.meat);
        System.out.println("Total price-------------------------" + totalPrice + " €");
    }

    public void printExtraAdditions() {
        if (!this.extraAdditions) {
            System.out.println("No extra additions");
            return;
        }
        System.out.println("----------------EXTRA ADDITIONS-------------------");
        printAdditionPrice(1, this.tomato);
        printAdditionPrice(2, this.lettuce);
        printAdditionPrice(3, this.onion);
        printAdditionPrice(4, this.carrot);
    }

    public void printAdditionPrice(int number, Addition addition) {
        String result = number + ". " + addition.getName() +
                "-------------------------" + addition.getPrice() + " €";
        if (addition.isSelected()) {
            result += "...[X]";
        }
        System.out.println(result);
    }

    public boolean isExtraAdditions() {
        return extraAdditions;
    }
}
