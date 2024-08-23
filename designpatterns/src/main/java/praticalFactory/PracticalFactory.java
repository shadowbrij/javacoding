package praticalFactory;

public class PracticalFactory {
    public static Query getQuery(QueryType type){
        if(type == QueryType.MONGODB){
            return new MongoDbQuery();
        } else if (type == QueryType.MYSQL) {
            return new MySQLQuery();
        }
        return null;
    }
}
