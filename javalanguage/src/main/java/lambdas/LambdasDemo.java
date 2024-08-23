package lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasDemo {
    public LambdasDemo(String message) {
    }

    public void print(String message){ }
    public static void greet(Printer printer){
        printer.printMessage("Helllo!!");
    }

    public static void show(){
        //lambdas expression
        greet(message -> System.out.println(message));

        //method reference
        //Class/object::object;
        greet(System.out::println);

        //using static method
//        greet(message -> print(message));
//        greet(LambdasDemo::print);

        //instance method
        var demo = new LambdasDemo("");
        greet(demo::print);
        greet(LambdasDemo::new);

        Printer printer = message -> System.out.println(message); //can store a lambda
        greet(new ConsolePrinter());

    }

//    public static void print(String message){
//
//    }

    public void demoChainConsumer(){
        List<String> list = List.of("a","b");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUC = item -> System.out.println(item.toUpperCase());

        //together
        list.forEach(print.andThen(printUC));
    }


    public void demoConsumerInterface(){
        List<Integer> list = List.of(1,2,3,3,4);
        //Imperative
        for(var item:list)
            System.out.println(item);
        //Declarative
        list.forEach(item -> System.out.println(item));
    }

    public void demoSupplierInterface(){
        Supplier<Double> getRandom = () -> Math.random();
        var rvalue = getRandom.get();//Lazy evaluation
        System.out.println(rvalue);
    }

    public void demoFunctionInterface(){
        Function<String,Integer> map = str -> str.length();
        var len = map.apply("sky");
        System.out.println(len);
    }

    public void demoComposeFunction(){
        //input key:value
        //1st transformation - key=value
        //2nd " {key=value}

        Function<String,String> putEqual = str -> str.replace(':','=');
        Function<String,String> bracket = str -> "{" + str + "}";

        //approach 1
        putEqual
                .andThen(bracket)
                .apply("name:brij");

        //approach 2
        bracket
                .compose(putEqual)
                .apply("name:brij");

    }

    public void demoPredicateInterface(){
        //check string has more than 5 chars
        Predicate<String> isLong = str -> str.length() > 5;
        isLong.test("arbaae");
    }

    public void demoCombinePredicate(){
        Predicate<String> hasleftBrace = str->str.startsWith("{");
        Predicate<String> hasRightBrace = str->str.endsWith("}");

        var newPred = hasleftBrace.and(hasRightBrace);
        newPred.test("{afdasd}");

        hasleftBrace.negate();
    }

}
