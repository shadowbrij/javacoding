package generics;

public class GenericList <T extends Comparable<T> & Cloneable>{
    private final T[] items = (T[]) new Object[10];
}
