package singleton.sync;

public class DbConnection {
    private DbConnection(){}
    private static DbConnection _connection;
    public synchronized DbConnection getInstance(){
        if(_connection == null){
            _connection = new DbConnection();
        }
        return _connection;
    }
}
