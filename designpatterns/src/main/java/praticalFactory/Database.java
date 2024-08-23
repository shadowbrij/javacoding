package praticalFactory;

public class Database {
    public void executeQuery(QueryType type){
        Query query= PracticalFactory.getQuery(type);
        if (query != null) {
            query.execute();
        }
    }
}
