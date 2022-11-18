package internet;

public class Client {

    /**
     * In proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern.
     * In proxy pattern, we create object having original object to interface its functionality to outer world.
     */

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
