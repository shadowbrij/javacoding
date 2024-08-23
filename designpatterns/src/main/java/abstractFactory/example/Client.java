package abstractFactory.example;

public class Client {
    public static void main(String[] args) {
        var db = new Database(new MongoDbQueryFactory());
        db.executeQuery();

        var db2 = new Database(new MySQLQueryFactory());
        db2.executeQuery();
    }
}
