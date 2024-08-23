package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","c");
        System.out.println(collection);
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.isEmpty());
        var stringArray = collection.toArray(new String[0]); //converts to string[]

         Collection<String> other = new ArrayList<>();
         other.addAll(collection);
        System.out.println(collection == other);
        System.out.println(collection.equals(other));
    }
}
