package lambdas;

public class ConsolePrinter implements Printer{
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
