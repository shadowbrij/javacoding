package abstractFactory.example;

public class Database {
    QueryFactory factory;

    public Database(QueryFactory factory) {
        this.factory = factory;
    }

    public void executeQuery(){
        factory.getQuery().execute();
    }
}
