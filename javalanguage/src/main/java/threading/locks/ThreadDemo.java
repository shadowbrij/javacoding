package threading.locks;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show(){
        List<Thread> list = new ArrayList<>();
        var status = new DownloadStatus();

        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            list.add(thread);
        }

        for(var thread : list) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Total Bytes "+ status.getTotolBytes());
    }

}
