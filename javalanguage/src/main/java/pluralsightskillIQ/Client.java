package pluralsightskillIQ;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Cat","Dog");
        var res = animals.stream()
                .toArray(Animal[]::new);
        SomeObject so = new SomeObject();
        byte num = 20;
        so.displayNumber(num);
    }
}
