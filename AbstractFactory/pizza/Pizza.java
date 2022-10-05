package pizza;

import ingredients.dough.Dough;
import ingredients.sauce.Sauce;
import ingredients.topping.Topping;

public class Pizza {
    private Dough dough;
    private Sauce sauce;
    private Topping topping;

    public Pizza(Dough dough, Sauce sauce, Topping topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza: \nSauce: "
                + sauce.toString()
                + "\nDough: " + dough.toString()
                + "\nTopping: " + topping.toString() + "\n";
    }
}
