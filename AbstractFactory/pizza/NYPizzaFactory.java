package pizza;

import ingredients.dough.Dough;
import ingredients.dough.ThinDough;
import ingredients.sauce.Sauce;
import ingredients.sauce.TomatoSauce;
import ingredients.topping.Topping;
import ingredients.topping.Tuna;

public class NYPizzaFactory extends PizzaFactory {

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Topping createTopping() {
        return new Tuna();
    }

}
