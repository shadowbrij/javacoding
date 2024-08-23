package oops;

public abstract class Employee {

    private final int age;
    private final String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Salaried extends Employee{
    public Salaried() {
        super(10,"Hi");
    }
}


