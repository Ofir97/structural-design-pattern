package toast;

import toast.decorates.Olive;
import toast.items.Coffee;
import toast.items.Toast;

public class Tester {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("cost: " + coffee.cost() + " for " + coffee.description());

        Toast t1 = new Toast();
        System.out.println("cost: " + t1.cost() + " for " + t1.description());

        Olive o1 = new Olive(t1);
        Olive o2 = new Olive(o1);
        Olive o3 = new Olive(o2);

        System.out.println("cost: " + o3.cost());
        System.out.println("desc: " + o3.description());
    }
}
