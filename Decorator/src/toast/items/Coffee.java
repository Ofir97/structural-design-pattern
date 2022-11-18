package toast.items;

public class Coffee extends Item {

    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String description() {
        return "coffee";
    }
}
