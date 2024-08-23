package praticalFactory;

public class MongoDbQuery implements Query{
    @Override
    public void execute() {
        System.out.println("MongoDb query executed!!");
    }
}
