package pizza;

public class PlainPizza implements Pizza{

    public PlainPizza(){
        System.out.println("Adding Dough");
    }

    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
