package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo2 {
    public static void show(){
        try(
                var reader = new FileReader("abc.txt");
                var writer = new FileWriter("abc.log")
        ) {
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e){
            System.out.println("Could nto read adata");
        }
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
