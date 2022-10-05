package pizza;

import ingredients.dough.Dough;
import ingredients.dough.ThickDough;
import ingredients.sauce.ChillySauce;
import ingredients.sauce.Sauce;
import ingredients.topping.Salmon;
import ingredients.topping.Topping;

public class ChicagoPizzaFactory extends PizzaFactory {

    @Override
    public Dough createDough() {

        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChillySauce();
    }

    @Override
    public Topping createTopping() {
        return new Salmon();
    }

}
