package threading.adders;

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


//    public static void show2(){
//        System.out.println(Thread.currentThread().getName());
//        Thread thread = new Thread(new DownloadFileTask());
//        thread.start();
//
//        try {
//            Thread.sleep(1000); //Current(main) thread sleeps
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        //Interrupt the child thread
//        thread.interrupt();
//
//
//
//
////        try {
////            thread.join(); //joins main thread
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
////        System.out.println("File is ready for scanne");
//
//    }
}
