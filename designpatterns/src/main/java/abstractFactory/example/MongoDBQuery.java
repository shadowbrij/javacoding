package abstractFactory.example;

public class MongoDBQuery implements Query{
    @Override
    public void execute() {
        System.out.println("MongoDB query executed!!");
    }
}
