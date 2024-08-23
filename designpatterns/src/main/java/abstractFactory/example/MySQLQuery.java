package abstractFactory.example;

public class MySQLQuery implements Query{
    @Override
    public void execute() {
        System.out.println("MySQL query executed !!");
    }
}
