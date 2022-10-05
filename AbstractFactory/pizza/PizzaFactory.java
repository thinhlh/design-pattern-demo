package pizza;

import ingredients.dough.Dough;
import ingredients.sauce.Sauce;
import ingredients.topping.Topping;

public abstract class PizzaFactory {
    public abstract Dough createDough();

    public abstract Sauce createSauce();

    public abstract Topping createTopping();
}
