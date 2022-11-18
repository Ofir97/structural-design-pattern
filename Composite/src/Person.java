public class Person extends Entity{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("My name is: " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
