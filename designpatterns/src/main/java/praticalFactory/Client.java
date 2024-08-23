package praticalFactory;


public class Client {
    public static void main(String[] args) {
        var db = new Database();
        db.executeQuery(QueryType.MONGODB);
    }
}
