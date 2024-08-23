package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show(){
        FileReader reader = null;
        try {
            reader = new FileReader("abc.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //try changing ordering it will show error because IOException is parent of FileNotFoundException
        catch (IOException | ParseException e){
            System.out.println("Could nto read adata");
        }
        finally {
            if(reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
//        try{
//        } catch (FileNotFoundException ex){
//            System.out.println(ex.getMessage());
//        }
        //sayHello(null);
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
