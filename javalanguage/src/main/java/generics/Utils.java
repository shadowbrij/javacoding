package generics;

public class Utils {
    public static int max(int first,int second){
        return (first >second) ? first : second;
    }
    //generic
     public static <T extends Comparable<T>>  T max(T first, T second){
        return first.compareTo(second) < 0 ? second : first;
     }

     public void printUser(GenericList<? extends User> user){

     }
}
