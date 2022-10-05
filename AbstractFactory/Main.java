import pizza.Pizza;
import pizza.PizzaType;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        Pizza pizza = kitchen.orderPizza(PizzaType.CHICAGO);

        System.out.println(pizza);
    }
}