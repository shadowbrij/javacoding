package threading.confinement;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show(){
        List<Thread> list = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);
            var thread = new Thread(task);
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

        var total = tasks.stream()
                .map(l -> l.getStatus().getTotolBytes())
                .reduce(Integer::sum);

        System.out.println(total.get());
        //sum bytes from all the task

    }

}
