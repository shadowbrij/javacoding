package abstractFactory.example;

public class MongoDbQueryFactory implements QueryFactory{
    @Override
    public Query getQuery() {
        return new MongoDBQuery();
    }
}
