package singleton.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConnection {
    private DbConnection(){}
    private static DbConnection _connection;
    private static final Lock _lock = new ReentrantLock();
    public static DbConnection getInstance(){
        if(_connection == null){
            _lock.lock();
            if(_connection == null)
                _connection = new DbConnection();
            _lock.unlock();
        }
        return _connection;
    }
}
