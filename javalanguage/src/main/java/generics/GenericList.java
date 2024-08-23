package generics;

public class GenericList <T extends Comparable & Cloneable>{
    private final T[] items = (T[]) new Object[10];
}
