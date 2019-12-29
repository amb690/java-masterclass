package academy.learnprogramming;

public class DeluxeBurger extends Burger {

    private Addition potatoes;
    private Addition drink;

    public DeluxeBurger(String name, String bread, String meat, double price) {
        super(name, bread, meat, price);
        this.drink = new Addition("drink", 5.2);
        this.potatoes = new Addition("potatoes", 8.9);
        super.addIngredient(drink);
        super.addIngredient(potatoes);
    }

    @Override
    public void printExtraAdditions() {
        System.out.println("----------------EXTRA ADDITIONS-------------------");
        printAdditionPrice(1, this.drink);
        printAdditionPrice(2, this.potatoes);
    }

    @Override
    public void checkBill() {
        printExtraAdditions();
        super.checkBill();
    }
}
