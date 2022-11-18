package toast.decorates;

import toast.items.Item;

public class Olive extends Item {

    private Item item; // has a

    public Olive(Item item) {
        this.item = item;
    }

    @Override
    public double cost() {
        return item.cost() + 2;
    }

    @Override
    public String description() {
        return item.description() + " + olives";
    }
}
