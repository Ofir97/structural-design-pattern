package pizza.ingredients;

import pizza.Pizza;
import pizza.ToppingDecorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);

        System.out.println("Adding Moz");
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mozzarella" ;
    }

    public double getCost() {
        return pizza.getCost() + .50;
    }
}
