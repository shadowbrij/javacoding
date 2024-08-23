package math;

import java.util.function.Function;

public class Runner {
    public static void main(String[] args) {
        MathOperation add = Integer::sum; //Function reference from lib
        MathOperation subtract = (a,b) -> a - b;

        System.out.println(add.operate(1,2));
        System.out.println(subtract.operate(5,3));

        //method-N
        calculate(1,2,add);

        //Function interface
        Function<String, String> printer = text -> {
            System.out.println(text);
            return text;
        };

        Function<String, String> upperCasePrinter = text -> {
            System.out.println(text.toUpperCase());
            return text;
        };

        //Benifit of having them is you can pass them around

        System.out.println(execute("Godbole",printer));
        System.out.println(execute("King in the North",upperCasePrinter));

        //Use case
        String type = "lower";
        System.out.println(decidePrinter(type).apply("Can you Print Me in Lowercase"));

        //Look at
        //BiFunction and in some lib(not in Java) TriFunction
        //Consumer
    }

    private static void calculate(int a, int b,MathOperation operation){
        System.out.println(a + "--------" + b);
        System.out.println(operation.operate(a,b));
    }

    private static String execute(String text,Function<String,String> function){
        return function.apply(text);
    }

    private static Function<String, String> decidePrinter(String type){
        return switch (type) {
            case "normal" -> Runner::print;
            case "upper" -> Runner::printUpper;
            case "lower" -> Runner::printLower;
            default -> null;
        };
    }
    private static String print(String text){
        System.out.println(text);
        return text;
    }
    private static String printUpper(String text){
        System.out.println(text.toUpperCase());
        return text;
    }
    private static String printLower(String text){
        System.out.println(text.toLowerCase());
        return text;
    }
}

