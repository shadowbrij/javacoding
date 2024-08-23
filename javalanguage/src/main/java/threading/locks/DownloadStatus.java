package threading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totolBytes;

    private final Lock lock = new ReentrantLock();
    public int getTotolBytes() {
        return totolBytes;
    }
    public void incrementTotolBytes() {
        lock.lock();
        try{
            this.totolBytes++;
        }
        finally {
            lock.unlock();
        }

//        synchronized (this){ //using this a bad practice
//            totolBytes++;
//        }
    }
}
