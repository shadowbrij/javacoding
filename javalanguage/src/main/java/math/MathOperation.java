package math;

//it is an optional annotation but at compile time it just checks that there is only a single abstract method
@FunctionalInterface
public interface MathOperation {
    int operate(int a, int b);
}
