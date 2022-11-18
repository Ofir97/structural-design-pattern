import printers.AbstractPrinter;
import printers.DeluxPrinter;
import printers.MidPrinter;
import printers.RegularPrinter;

public class Test {

    public static void main(String[] args) {
        AbstractPrinter printer = new DeluxPrinter();
        printer.printTestPage();
        System.out.println("--------------------------------------------");

        AbstractPrinter printer2 = new MidPrinter();
        printer2.printTestPage();
        System.out.println("--------------------------------------------");

        AbstractPrinter printer3 = new RegularPrinter();
        printer3.printTestPage();
    }
}
