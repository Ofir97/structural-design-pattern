package pizza;

import pizza.ingredients.Mozzarella;
import pizza.ingredients.TomatoSauce;

public class PizzaShop {

    /**
     * The Decorator allows you to modify an object dynamically
     * We still use inheritance capabilities, but want to add functionality at run time
     * It is more flexible than inheritance (inheritance is static)
     * Rather than rewrite old code, you can extend with new code
     * Simplifies code because you add functionality using many simple classes
     * Inheritance is static, while composition is dynamic
     *
     */
    public static void main(String[] args) {
        Pizza basicPizza = new Mozzarella(new TomatoSauce(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Cost: " + basicPizza.getCost());
    }
}
