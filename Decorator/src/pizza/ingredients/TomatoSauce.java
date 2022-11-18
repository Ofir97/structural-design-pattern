package pizza.ingredients;

import pizza.Pizza;
import pizza.ToppingDecorator;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza pizza) {
        super(pizza);

        System.out.println("Adding Tomato Sauce");
    }

    public String getDescription() {
        return pizza.getDescription() + ", Tomato Sauce" ;
    }

    public double getCost() {
        return pizza.getCost() + .35;
    }
}
