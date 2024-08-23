package abstractFactory.example;

public class MySQLQueryFactory implements QueryFactory{
    @Override
    public Query getQuery() {
        return new MySQLQuery();
    }
}
