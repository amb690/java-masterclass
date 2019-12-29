package academy.learnprogramming;

public class HealthyBurger extends Burger {

    private Addition tofu;
    private Addition egg;

    public HealthyBurger(String name, String meat, double price) {
        super(name, "Brown bread roll", meat, true, price);
        this.tofu = new Addition("Tofu", 0.5);
        this.egg = new Addition("Egg", 0.7);
    }

    @Override
    public void selectIngredient(int selected) {
        super.selectIngredient(selected);
        switch (selected) {
            case 5:
                addIngredient(this.tofu);
                break;
            case 6:
                addIngredient(this.egg);
                break;
        }
    }

    @Override
    public void printExtraAdditions() {
        super.printExtraAdditions();
        printAdditionPrice(5, this.tofu);
        printAdditionPrice(6, this.egg);
    }
}
