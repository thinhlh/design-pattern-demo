import javax.sound.sampled.ReverbType;

import pizza.ChicagoPizzaFactory;
import pizza.NYPizzaFactory;
import pizza.Pizza;
import pizza.PizzaFactory;
import pizza.PizzaType;

public class Kitchen {
    public Pizza orderPizza(PizzaType type) {

        PizzaFactory factory = null;

        if (type == PizzaType.CHICAGO) {
            factory = new ChicagoPizzaFactory();
        } else if (type == PizzaType.NY) {
            factory = new NYPizzaFactory();
        }

        if (factory != null) {
            Pizza pizza = new Pizza(factory.createDough(), factory.createSauce(), factory.createTopping());

            return pizza;
        }

        return null;
    }
}
