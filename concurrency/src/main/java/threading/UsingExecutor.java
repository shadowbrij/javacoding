package threading;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class UsingExecutor {
    public static void main(String[] args) {
        ExecutorService executer = Executors.newFixedThreadPool(5);

    }
}

@Documented
@Target({ElementType.CONSTRUCTOR,ElementType.METHOD})
@interface MyCustomAnnotation{
    String  description = null;

}
